package com.api.models.Response.RealEstateProjects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RealEstateProjectResponse {
    
    private RealEstateProjectData data;
    private int status;
    private String message;

    // Getters & Setters
    public RealEstateProjectData getData() {
        return data;
    }

    public void setData(RealEstateProjectData data) {
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}