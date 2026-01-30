package Testcases.RealEstateProjects;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.api.BuissnessRules.SellRealEstateProjectRules;
import com.api.Checker.RealEstateProjectActionsChecker;
import com.api.DataLoader.RealEstateDataLoader;
import com.api.Utils.JsonUtils;
import com.api.models.Request.RealEstateProjects.SellprojectPostRequest;
import com.api.models.Response.RealEstateProjects.RealEstateProjectData;
import com.api.models.Response.RealEstateProjects.RealEstateProjectResponse;
import com.api.models.UtilsModels.CheckActionsModel;

import Assertions.SellProjectAssertion;
import Flow.RealEstateProjects.SellProjectFlow;
import io.restassured.response.Response;

public class SellProjectTestCase {

  @Test
  public void sellRealEstateProjectTestCase() {

  

    SellprojectPostRequest sellRequest = RealEstateDataLoader.sellProjectLoadData();

    Response response = new SellProjectFlow().sellRealestateProjectFlow(
      RealEstateDataLoader.projectLoadData(),
       RealEstateDataLoader.linkedProjectToFundLoadData(),
       sellRequest);



      RealEstateProjectResponse realEstateProjectResponse = JsonUtils.toObject(response,
            RealEstateProjectResponse.class);


    SellRealEstateProjectRules expectedRules = SellRealEstateProjectRules.validateSellProjectRequest(sellRequest);

    new SellProjectAssertion().assertActionsValues(realEstateProjectResponse.getData(), expectedRules);

    List<CheckActionsModel> actionChecks = RealEstateProjectActionsChecker.checkProjectActions(realEstateProjectResponse);

    SoftAssert softAssert = new SoftAssert();
    for(CheckActionsModel check : actionChecks) {
       softAssert.assertEquals(check.getActual_Result(), check.getExpected_Result(), "Action check failed for: " +
       check.getEndpoint());
    }
    softAssert.assertAll();

  }

}