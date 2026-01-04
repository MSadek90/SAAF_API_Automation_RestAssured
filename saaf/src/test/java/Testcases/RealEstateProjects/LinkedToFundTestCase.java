package Testcases.RealEstateProjects;

import org.testng.annotations.Test;

import com.api.Utils.JsonUtils;
import com.api.models.Request.RealEstateProjects.LinkedProjectToFundPostRequest;
import com.api.models.Request.RealEstateProjects.RealEstateProjectPostRequest;

import Assertions.ProjcetsAssertions;
import Flow.RealEstateProjects.LinkedprojectToFundFlow;
import io.restassured.response.Response;


public class LinkedToFundTestCase {
    

    @Test
    public void testLinkedProjectToFund() {
             
       //to get data
        RealEstateProjectPostRequest projectRequest = JsonUtils.fromJson(
            "src/test/java/resources/RealEstateProjects/RealEstateProjectRequest.json",
            RealEstateProjectPostRequest.class);


       LinkedProjectToFundPostRequest linkRequest = JsonUtils.fromJson(
           "src/test/java/resources/RealEstateProjects/LinkedProjectToFund.json",
           LinkedProjectToFundPostRequest.class);
         


        LinkedprojectToFundFlow linkedprojectToFundFlow = new LinkedprojectToFundFlow();

        int projectId = linkedprojectToFundFlow.createProjectAndGetId(projectRequest);
        linkRequest.setProjectId(projectId);
        Response response = linkedprojectToFundFlow.LinkprojectToFund(linkRequest);

        //Assertions
        ProjcetsAssertions.logResponse(response);
        ProjcetsAssertions.validate200Ok(response);
       
    }
    
}
