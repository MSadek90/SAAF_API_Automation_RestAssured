package Flow.RealEstateProjects;


import com.api.models.Request.RealEstateProjects.LinkedProjectToFundPostRequest;
import com.api.models.Request.RealEstateProjects.RealEstateProjectPostRequest;
import com.api.models.Request.RealEstateProjects.SellprojectPostRequest;

import Flow.abstarctProjectFlowBase;
import io.restassured.response.Response;


public class SellProjectFlow extends abstarctProjectFlowBase {


   

    public  Response sellRealestateProjectFlow(RealEstateProjectPostRequest projectRequest,
                                              LinkedProjectToFundPostRequest linkProjectRequest,
                                              SellprojectPostRequest request){


        
    // create new project and return project id 
     int Project_id = createProjectAndGetId(projectRequest);

     //to pass the new project id to request of fund
     linkProjectRequest.setProjectId(Project_id);
     linkProjectToFund(linkProjectRequest);


     //Ready new Project to use
     readyProjectForUse(Project_id);


     //Return the response of the Sell Endpoint to make assertio on them
     return projectsService.sellProjectAction(request, Project_id);

    }
        

}
