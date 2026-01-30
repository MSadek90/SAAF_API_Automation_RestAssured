package com.api.Service.OrganizationService;

import com.api.Client.RestClient;
import com.api.Endpoints.AllEndPoints;

import io.restassured.response.Response;

public class Employees {
    
    // Get employee by ID
    public static Response getEmployeeById(int id) {
        return RestClient.show(AllEndPoints.EMPLOYEES_SHOW, "id", id);
    }



    // Get all employees
    public static Response getAllEmployees() {
        return RestClient.list(AllEndPoints.EMPLOYEES_INDEX);
    }


    // Get employee permissions
    public static Response getEmployeePermissions(String token) {
        return RestClient.show(AllEndPoints.EMPLOYEES_PERMISSIONS, token);
    }

}
