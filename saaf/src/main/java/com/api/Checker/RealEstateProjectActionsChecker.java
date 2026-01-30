package com.api.Checker;


import java.util.ArrayList;
import java.util.List;

import org.checkerframework.checker.units.qual.A;
import org.checkerframework.checker.units.qual.s;

import com.api.Endpoints.AllEndPoints;
import com.api.Service.ProjectsService;
import com.api.models.Response.RealEstateProjects.RealEstateProjectResponse;
import com.api.models.UtilsModels.CheckActionsModel;

import io.restassured.response.Response;

public class RealEstateProjectActionsChecker {

    public static List<CheckActionsModel> checkProjectActions(RealEstateProjectResponse response) {

        List<CheckActionsModel> checks = new ArrayList<>();
        if (response.getData().getActions().canDeliver() == false) {


            Response response1 = ProjectsService.deliverProjectAction(response.getData().getId());
            CheckActionsModel check1 = new CheckActionsModel();
            check1.setEndpoint(AllEndPoints.PROJECTS_DELIVER);
            check1.setExpected_Result(403);
            check1.setActual_Result(response1.getStatusCode());
            checks.add(check1);
        }

        if (response.getData().getActions().canReceivePayment() == false) {

            Response response2 = ProjectsService.receivePaymentAction(response.getData().getId());

            CheckActionsModel check2 = new CheckActionsModel(); 
            check2.setEndpoint(AllEndPoints.PROJECTS_RECEIVE_PAYMENT);
            check2.setExpected_Result(403);
            check2.setActual_Result(response2.getStatusCode());
            checks.add(check2);
            
        }

        if (response.getData().getActions().canReturnAdvance() == false) {

            Response response3 = ProjectsService.returnAdvanceAction(response.getData().getId());

            CheckActionsModel check3 = new CheckActionsModel();
            check3.setEndpoint(AllEndPoints.PROJECTS_RETURN_ADVANCE);
            check3.setExpected_Result(403);
            check3.setActual_Result(response3.getStatusCode());
            checks.add(check3);
        }
        return checks;
    }

}


