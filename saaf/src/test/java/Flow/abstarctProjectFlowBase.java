package Flow;

import com.api.Service.ProjectsService;
import com.api.models.Request.RealEstateProjects.LinkedProjectToFundPostRequest;
import com.api.models.Request.RealEstateProjects.RealEstateProjectPostRequest;

import io.restassured.response.Response;

public abstract class abstarctProjectFlowBase {
     

    protected ProjectsService projectsService = new ProjectsService();

     public int createProjectAndGetId(RealEstateProjectPostRequest request){
        Response response = projectsService.createProject(request);
        return response.jsonPath().getInt("id");
     }

     public Response linkProjectToFund(LinkedProjectToFundPostRequest request){
       Response response = projectsService.linkProjectToFund(request);
       return response;
     }

     public Response readyProjectForUse(int id){
      Response response = projectsService.readyForUseAction(id);
      return response;
     }


}
