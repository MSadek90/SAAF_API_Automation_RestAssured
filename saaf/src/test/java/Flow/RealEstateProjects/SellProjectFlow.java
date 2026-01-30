package Flow.RealEstateProjects;

import org.apache.commons.logging.Log;
import org.apache.logging.log4j.LogManager;

import com.api.models.Request.RealEstateProjects.LinkedProjectToFundPostRequest;
import com.api.models.Request.RealEstateProjects.RealEstateProjectPostRequest;
import com.api.models.Request.RealEstateProjects.SellprojectPostRequest;

import Flow.abstarctProjectFlowBase;
import Flow.Organization.ValidateEmployeePermissionsFlow;
import io.restassured.response.Response;

public class SellProjectFlow extends abstarctProjectFlowBase {

    public static final org.apache.logging.log4j.Logger logger = LogManager
            .getLogger(ValidateEmployeePermissionsFlow.class);

    public Response sellRealestateProjectFlow(RealEstateProjectPostRequest projectRequest,
            LinkedProjectToFundPostRequest linkProjectRequest,
            SellprojectPostRequest request) {

                

        // create new project and return project id
        Response response = createProjectAndGetId(projectRequest);
        if (response.jsonPath().get("data.id") == null) {

            logger.error("Project id is null , project creation failed");
            throw new RuntimeException("Project id is null in the response of createProjectAndGetId, project creation failed");
        }

        int Project_id = response.jsonPath().getInt("data.id");
        logger.info("Created Project id is : " + Project_id);

        // pass the new created project_id to linked it to the fund
        linkProjectRequest.setProjectId(Project_id);

        linkProjectToFund(linkProjectRequest);

        // Ready new Project to use
        readyProjectForUse(Project_id);

        // Return the response of the Sell Endpoint to make assertio on them
        return projectsService.sellProjectAction(request, Project_id);

    }

}
