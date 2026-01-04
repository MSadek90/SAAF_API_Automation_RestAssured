package Testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.Service.ProjectsService;
import com.api.Utils.JsonUtils;
import com.api.models.Request.RealEstateProjects.RealEstateProjectPostRequest;

import io.restassured.response.Response;

public class CreateProjectTestCases {

    @Test
    public void createProjectTest(){


        RealEstateProjectPostRequest request = JsonUtils.fromJson(
            "src/test/java/resources/RealEstateProjects/RealEstateProjectRequest.json",
            RealEstateProjectPostRequest.class);



      Response response = new ProjectsService().createProject(request);
      Assert.assertEquals(response.statusCode(), 200);
    }
    
}
