package com.api.Service.OrganizationService;

import com.api.Client.RestClient;
import com.api.Endpoints.AllEndPoints;

import io.restassured.response.Response;

public class Employees {
    
    // Get employee by ID
    public static Response getEmployeeById(int id, String token) {
        return RestClient.show(AllEndPoints.EMPLOYEES_SHOW, "id", id, token);
    }



    // Get all employees
    public static Response getAllEmployees() {
        return RestClient.list(AllEndPoints.EMPLOYEES_INDEX);
    }

}
