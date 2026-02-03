package TestCasesHelper;

import java.util.List;

import org.testng.asserts.SoftAssert;

import com.api.Checker.RealEstateProjectActionsChecker;
import com.api.Service.ProjectsService;
import com.api.models.Response.RealEstateProjects.RealEstateProjectResponse;
import com.api.models.UtilsModels.CheckActionsModel;

import io.restassured.response.Response;

public class SellProjectHelper {

    public static void validateProjectAction(RealEstateProjectResponse response)
            throws IllegalArgumentException, IllegalAccessException {

        // #1. Check Project Actions endpoints
        List<CheckActionsModel> actionChecks = RealEstateProjectActionsChecker
                .checkProjectActions(response);
                

        SoftAssert softAssert = new SoftAssert();
        Response response1;

        // #2. Loop on each endpoint and validate its response is 400
        for (CheckActionsModel check : actionChecks) {

            System.out.println("Checking endpoint: " + check.getEndpoint());
            System.out.println("With body: " + check.getBody());
            System.out.println("Project ID: " + response.getData().getId());
            // #3. Validate each endpoint's response
            if (check.getEndpoint().equals("project-phase")) { // endpoint for readyForUse is put not post
                response1 = ProjectsService.readyForUseAction(response.getData().getId());
                softAssert.assertEquals(response1.getStatusCode(), 400, "Action: [project-phase] should return 400");
            }
            // #4. Validate each endpoint's request body
            else {
                
                response1 = ProjectsService.PostRequest(check.getEndpoint(), check.getBody(),
                        response.getData().getId());
                softAssert.assertEquals(response1.getStatusCode(), 400,
                        "Action: [" + check.getEndpoint() + "] should return 400");
            }
        }

        // #5. Assert all
        softAssert.assertAll();

    }

}
