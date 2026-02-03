package Flow;

import org.checkerframework.checker.units.qual.s;

import com.api.Service.ProjectsService;
import com.api.models.Request.RealEstateProjects.LinkedProjectToFundPostRequest;
import com.api.models.Request.RealEstateProjects.RealEstateProjectPostRequest;

import io.restassured.response.Response;

public abstract class abstarctProjectFlowBase {
     
     public static Response createProjectAndGetId(RealEstateProjectPostRequest request){
        Response response = ProjectsService.createProject(request);
        return response;
     }

     public static Response linkProjectToFund(LinkedProjectToFundPostRequest request){
       Response response = ProjectsService.linkProjectToFund(request);
       return response;
     }

     public static Response readyProjectForUse(int id){
      Response response = ProjectsService.readyForUseAction(id);
      return response;
     }


}
