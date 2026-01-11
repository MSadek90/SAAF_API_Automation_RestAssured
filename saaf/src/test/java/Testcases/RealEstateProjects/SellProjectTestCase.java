package Testcases.RealEstateProjects;

import org.testng.annotations.Test;

import com.api.Utils.JsonUtils;
import com.api.models.Request.RealEstateProjects.LinkedProjectToFundPostRequest;
import com.api.models.Request.RealEstateProjects.RealEstateProjectPostRequest;
import com.api.models.Request.RealEstateProjects.SellprojectPostRequest;
import com.api.models.Response.RealEstateProjects.RealEstateProjectGetResponse;

import Assertions.SellProjectAssertion;
import Flow.RealEstateProjects.SellProjectFlow;
import io.restassured.response.Response;

public class SellProjectTestCase {


    @Test
    public void sellRealEstateProjectTestCase(){


       
        //to get data
          RealEstateProjectPostRequest projectRequest = JsonUtils.fromJson(
            "src/test/java/resources/Request/RealEstateProjectRequest.json",
            RealEstateProjectPostRequest.class);

       
            LinkedProjectToFundPostRequest linkRequest = JsonUtils.fromJson(
           "src/test/java/resources/Request/LinkedProjectToFund.json",
           LinkedProjectToFundPostRequest.class);

           
       
           SellprojectPostRequest sellRequest = JsonUtils.fromJson(
           "src/test/java/resources/Request/SellProjectRequest.json",
           SellprojectPostRequest.class);

           

        Response response = new SellProjectFlow().sellRealestateProjectFlow(projectRequest, linkRequest, sellRequest);
        RealEstateProjectGetResponse realEstateProjectGetResponse = JsonUtils.toObject(response,RealEstateProjectGetResponse.class);
        new SellProjectAssertion().assertActionsValues(realEstateProjectGetResponse);
        
    }
    
}