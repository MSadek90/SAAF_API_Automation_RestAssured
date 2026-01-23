package Flow.Organization;

import static io.restassured.RestAssured.given;


import java.util.List;
import java.util.logging.Logger;

import org.testng.Assert;

import com.api.Service.GetTokenService;
import com.api.Service.OrganizationService.Employees;
import com.api.Utils.PermissionsMapper;
import com.api.models.UtilsModels.EndpointModel;

import org.apache.logging.log4j.LogManager; 
import io.restassured.response.Response;

public class ValidateEmployeePermissionsFlow {



    private static final org.apache.logging.log4j.Logger logger =  LogManager.getLogger(ValidateEmployeePermissionsFlow.class);


    public static void ValidateEmployeePermissions(int employeeId) {

        Response response = null;

        logger.info("🚀 Starting Permission Validation Flow for Employee ID: {}", employeeId);
        // Get token for admin
        String token = GetTokenService.getTokenForAdmin(employeeId).jsonPath().getString("token");

        logger.info("Token for employee {} is: {}", employeeId, token);

        // return employee Response >>>>> permissions
        Response employeeResponse = Employees.getEmployeeById(employeeId, token);

        if (employeeResponse.getStatusCode() != 200) {
            logger.error("Failed to retrieve employee details for employee ID: {}. Status Code: {}", employeeId, employeeResponse.getStatusCode());
            Assert.assertEquals(employeeResponse.getStatusCode(), 200,
                "Failed to get employee details for employee ID: " + employeeId);
        }

        

        logger.info("Employee Response: {}", employeeResponse.asString());

        List<String> permissions = employeeResponse.jsonPath()
                .getList("data.permissions.collect{it.subject + '.' + it.action}");


        if (permissions == null || permissions.isEmpty()) {
            logger.warn("No permissions found for employee: {}", employeeId);
            return;
        }

        // Validate permissions
        for (String permission : permissions) {
            EndpointModel endpointModel = PermissionsMapper.getEndPoint(permission);

            if (endpointModel != null) {
                response = given()
                        .header("Authorization", "Bearer " + token)
                        .contentType("application/json")
                        .when()
                        .request(endpointModel.getMethod(), endpointModel.getBaseUrl());

                        logger.info("Permission: {}>>> status: {}", permission, response.getStatusCode());
            } else {
                logger.warn("No endpoint mapping found for permission: {}", permission);
            }

            if (response != null) {
                if (response.getStatusCode() == 403 || response.getStatusCode() == 401) {
                    logger.warn("Access denied for permission: {}", permission);
                } else if (response.getStatusCode() == 500) {
                    logger.error("Internal server error for permission: {}", permission);
                }

            }

        }

        logger.info("✅ Permission Validation Flow completed for Employee ID: {}", employeeId);

    }

}
