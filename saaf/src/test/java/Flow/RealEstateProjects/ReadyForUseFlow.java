package Flow.RealEstateProjects;

import com.api.models.Request.RealEstateProjects.LinkedProjectToFundPostRequest;
import com.api.models.Request.RealEstateProjects.RealEstateProjectPostRequest;

import Flow.abstarctProjectFlowBase;
import io.restassured.response.Response;

public class ReadyForUseFlow extends abstarctProjectFlowBase {

    public Response readyProjectForUseFlow(RealEstateProjectPostRequest request,
                                        LinkedProjectToFundPostRequest request2){

                                  
    // create new project and return project id                                        
    int project_id = createProjectAndGetId(request);


    // pass the new created project_id to linked it to the fund
    request2.setProjectId(project_id);
    linkProjectToFund(request2);

    
    return projectsService.readyForUseAction(project_id);
    
}

}
