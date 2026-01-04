package Flow.RealEstateProjects;

import com.api.Service.ProjectsService;
import com.api.models.Request.RealEstateProjects.LinkedProjectToFundPostRequest;
import com.api.models.Request.RealEstateProjects.RealEstateProjectPostRequest;

import io.restassured.response.Response;

public class LinkedprojectToFundFlow {
    

       ProjectsService projectsService = new ProjectsService();

        public int createProjectAndGetId (RealEstateProjectPostRequest request){
            return projectsService.createProject(request).jsonPath().getInt("data.id");
        }

        public Response LinkprojectToFund(LinkedProjectToFundPostRequest request){
            return projectsService.linkProjectToFund(request);
        }

        

}
