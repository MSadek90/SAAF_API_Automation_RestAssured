package Testcases;



import org.testng.annotations.Test;

import com.api.Utils.JsonUtils;
import com.api.models.Request.Organization.getTokenForEmployeeRequest;

import Flow.Organization.ValidateEmployeePermissionsFlow;


public class ValidateEmployeePermissions {

    @Test
    public void testValidateEmployeePermissions() {


        
        getTokenForEmployeeRequest request = JsonUtils.fromJson(
         "src/test/java/resources/Request/Organization/Employees.json", getTokenForEmployeeRequest.class);

        ValidateEmployeePermissionsFlow.ValidateEmployeePermissions(request.getEmployeeId());
    }
}
