package Flow.RealEstateProjects;

import com.api.Service.ProjectsService;
import com.api.models.Request.RealEstateProjects.LinkedProjectToFundPostRequest;
import com.api.models.Request.RealEstateProjects.RealEstateProjectPostRequest;

import io.restassured.response.Response;

public class ReadyForUseFlow {
    

    public int createProjectAndGetId(RealEstateProjectPostRequest request) {
        Response response = new ProjectsService().createProject(request);
        return response.jsonPath().getInt("id");
    }

    public Response linkProjectToFund(LinkedProjectToFundPostRequest request) {
        return new ProjectsService().linkProjectToFund(request);
    }

   /*  public Response readyForUseAction() {
        return new ProjectsService().readyForUseAction();
    }
    
*/
}
