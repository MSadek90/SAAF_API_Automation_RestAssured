package com.api.Service;

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
        return RestClient.get(AllEndPoints.PROJECTS_SHOW, "project_id", projectId);
    }


    //link project to fund
    public Response linkProjectToFund(LinkedProjectToFundPostRequest request) {
        return RestClient.post(AllEndPoints.PROJECTS_LINK_FUND, request);
    }


    //Ready for use action
    public Response readyForUseAction(int value) {
        return RestClient.put(AllEndPoints.PROJECTS_PHASE_UPDATE, "project_id", value);
    }

    //Sell project action
    public Response sellProjectAction(SellprojectPostRequest request, int value) {
        return RestClient.postWithId(AllEndPoints.PROJECTS_SELL, request, "project_id", value);
    }

}
