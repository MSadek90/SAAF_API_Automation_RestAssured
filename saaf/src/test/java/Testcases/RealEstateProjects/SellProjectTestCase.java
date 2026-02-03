package Testcases.RealEstateProjects;

import java.util.List;

import org.checkerframework.checker.units.qual.C;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.api.BuissnessRules.SellRealEstateProjectRules;
import com.api.Checker.RealEstateProjectActionsChecker;
import com.api.DataLoader.RealEstateDataLoader;
import com.api.Service.ProjectsService;
import com.api.models.Request.RealEstateProjects.ReceiveProjectPaymentRequest;
import com.api.models.Request.RealEstateProjects.SellprojectPostRequest;
import com.api.models.Response.RealEstateProjects.RealEstateProjectResponse;


import Assertions.SellProjectAssertion;
import Flow.RealEstateProjects.SellProjectFlow;
import TestCasesHelper.SellProjectHelper;
import io.restassured.response.Response;

public class SellProjectTestCase {

  @Test
  public void sellRealEstateProjectTestCase() throws IllegalArgumentException, IllegalAccessException {

    // #1. Load Sell Project Request Data to use it in step (2 & 3)
    SellprojectPostRequest sellRequest = RealEstateDataLoader.sellProjectLoadData();

    // #2. Call Sell Project Flow
    Response response = SellProjectFlow
        .sellRealestateProjectFlow(RealEstateDataLoader.projectLoadData(),
            RealEstateDataLoader.linkedProjectToFundLoadData(),
            sellRequest);

    // #3. Validate Sell Project Business Rules
    SellRealEstateProjectRules expectedRules = SellRealEstateProjectRules.validateSellProjectRequest(sellRequest);

    // #4. Get Actual Response
    RealEstateProjectResponse actualResponse = response.as(RealEstateProjectResponse.class);

    // #5. Assert Sell Project Actions Values
    new SellProjectAssertion().assertActionsValues(actualResponse, expectedRules);

    // #6. Check Project Actions endpoints
    SellProjectHelper.validateProjectAction(actualResponse);

  }

}