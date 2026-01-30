package com.api.Service;

import org.checkerframework.checker.units.qual.s;

import com.api.Client.RestClient;
import com.api.Endpoints.AllEndPoints;
import com.api.models.Request.RealEstateProjects.LinkedProjectToFundPostRequest;
import com.api.models.Request.RealEstateProjects.RealEstateProjectPostRequest;
import com.api.models.Request.RealEstateProjects.SellprojectPostRequest;

import io.restassured.response.Response;

public class ProjectsService {
    

    // Create a new project
    public Response createProject(RealEstateProjectPostRequest request){
        return RestClient.post(AllEndPoints.PROJECTS_STORE, request);
    }

    // Get project details by ID
    public Response getProjectDetails(int projectId) {
        return RestClient.show(AllEndPoints.PROJECTS_SHOW, "id", projectId);
    }


    //link project to fund
    public Response linkProjectToFund(LinkedProjectToFundPostRequest request) {
        return RestClient.post(AllEndPoints.PROJECTS_LINK_FUND, request);
    }


    //Ready for use action
    public Response readyForUseAction(int value) {
        return RestClient.put(AllEndPoints.PROJECTS_PHASE_UPDATE, "id", value);
    }

    //Sell project action
    public Response sellProjectAction(SellprojectPostRequest request, int value) {
        return RestClient.postWithId(AllEndPoints.PROJECTS_SELL, request, "id", value);
    }


    //Receive payment project
    public static Response receivePaymentAction(int value) {
        return RestClient.put(AllEndPoints.PROJECTS_RECEIVE_PAYMENT, "id", value);
    }

    //Deliver project
    public static Response deliverProjectAction(int value) {
        return RestClient.put(AllEndPoints.PROJECTS_DELIVER, "id", value);
    }

    //Return advance project
    public static Response returnAdvanceAction(int value) {
        return RestClient.put(AllEndPoints.PROJECTS_RETURN_ADVANCE, "id", value);
    }

}
