package com.api.Service;

import com.api.Client.RestClient;
import com.api.Endpoints.RealStateProject.ProjectsEndPoints;
import com.api.models.Request.RealEstateProjects.LinkedProjectToFundPostRequest;
import com.api.models.Request.RealEstateProjects.RealEstateProjectPostRequest;
import com.api.models.Request.RealEstateProjects.SellprojectPostRequest;

import io.restassured.response.Response;

public class ProjectsService {
    

    // Create a new project
    public Response createProject(RealEstateProjectPostRequest request){
        return RestClient.post(ProjectsEndPoints.Create_New_Project, request);
    }

    // Get project details by ID
    public Response getProjectDetails(int projectId) {
        return RestClient.get(ProjectsEndPoints.Get_Project, "project_id", projectId);
    }


    //link project to fund
    public Response linkProjectToFund(LinkedProjectToFundPostRequest request) {
        return RestClient.post(ProjectsEndPoints.Linked_Project_ToFund, request);
    }


    //Ready for use action
    public Response readyForUseAction(int value) {
        return RestClient.put(ProjectsEndPoints.ReadyForUse_Action, "project_id", value);
    }

    //Sell project action
    public Response sellProjectAction(SellprojectPostRequest request, int value) {
        return RestClient.postWithId(ProjectsEndPoints.Sell_Project, request, "project_id", value);
    }

}
