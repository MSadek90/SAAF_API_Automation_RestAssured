package Flow.RealEstateProjects;

import com.api.Service.ProjectsService;
import com.api.models.Request.RealEstateProjects.LinkedProjectToFundPostRequest;
import com.api.models.Request.RealEstateProjects.RealEstateProjectPostRequest;

import io.restassured.response.Response;

public class LinkedprojectToFundFlow {
    

    protected final ProjectsService projectsService = new ProjectsService();

    public int createProjectAndGetId (RealEstateProjectPostRequest request){
        return projectsService.createProject(request)
        .then().log().all()
        .extract().jsonPath().getInt("data.id");
    }

    public Response linkProjectToFund(LinkedProjectToFundPostRequest request){
        return projectsService.linkProjectToFund(request);
    }
}
