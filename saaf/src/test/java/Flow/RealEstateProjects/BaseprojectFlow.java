package Flow.RealEstateProjects;

import com.api.Service.ProjectsService;
import com.api.models.Request.RealEstateProjects.RealEstateProjectPostRequest;

import io.restassured.response.Response;

public abstract class BaseprojectFlow {
     


     public int createProjectAndGetId(RealEstateProjectPostRequest request){
        Response response = new ProjectsService().createProject(request);
        return response.jsonPath().getInt("id");
     }


}
