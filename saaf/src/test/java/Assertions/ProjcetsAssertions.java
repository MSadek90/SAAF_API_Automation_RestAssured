package Assertions;

import org.testng.Assert;

import io.restassured.response.Response;



public class ProjcetsAssertions {


    public static void validate200Ok(Response response){
        Assert.assertEquals(response.getStatusCode(), 200);
    }

    public static void logResponse(Response response) {
        System.out.println(response.getBody());
        System.out.println("Response Body: " + response.getBody().asString());
        System.out.println("Response Status Code: " + response.getStatusCode());
    }

}
