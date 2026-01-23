package Testcases.RealEstateProjects;

import org.testng.annotations.Test;

import com.api.Utils.JsonUtils;
import com.api.models.Request.RealEstateProjects.LinkedProjectToFundPostRequest;
import com.api.models.Request.RealEstateProjects.RealEstateProjectPostRequest;

import Assertions.ProjcetsAssertions;
import Flow.RealEstateProjects.LinkedprojectToFundFlow;
import io.restassured.response.Response;


public class LinkProjectToFundTestCase {
    

    @Test
    public void testLinkedProjectToFund() {
             //saaf\src\test\java\resources\Request\LinkProjectToFundRequest.json
       //to get data
        RealEstateProjectPostRequest projectRequest = JsonUtils.fromJson(
            "src/test/java/resources/Request/RealEstateProjectRequest.json",
            RealEstateProjectPostRequest.class);


       LinkedProjectToFundPostRequest linkRequest = JsonUtils.fromJson(
           "src/test/java/resources/Request/LinkProjectToFundRequest.json",
           LinkedProjectToFundPostRequest.class);
         


        LinkedprojectToFundFlow linkedprojectToFundFlow = new LinkedprojectToFundFlow();

        int projectId = linkedprojectToFundFlow.createProjectAndGetId(projectRequest);
        linkRequest.setProjectId(projectId);
        Response response = linkedprojectToFundFlow.linkProjectToFund(linkRequest);

        //Assertions
        ProjcetsAssertions.logResponse(response);
        ProjcetsAssertions.validate200Ok(response);
       
    }
    
}
