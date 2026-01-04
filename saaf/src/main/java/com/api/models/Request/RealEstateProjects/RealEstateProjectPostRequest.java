package com.api.models.Request.RealEstateProjects;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RealEstateProjectPostRequest {

    private String name;
    
     @JsonProperty("project_size")
    private int projectSize;

    @JsonProperty("project_type")
    private String projectType;

    @JsonProperty("price_per_meter")
    private int pricePerMeter;

    @JsonProperty("suk_number")
    private String sukNumber;

    private String location;

    @JsonProperty("developer_ids")
    private List<Integer> developerIds;

    @JsonProperty("for_type")
    private String forType;





    
    // Getters & Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getProjectSize() {
        return projectSize;
    }

    public void setProjectSize(int projectSize) {
        this.projectSize = projectSize;
    }

    public String getProjectType() {
        return projectType;
    }

    public void setProjectType(String projectType) {
        this.projectType = projectType;
    }

    public int getPricePerMeter() {
        return pricePerMeter;
    }

    public void setPricePerMeter(int pricePerMeter) {
        this.pricePerMeter = pricePerMeter;
    }


    public String getSukNumber() {
        return sukNumber;
    }

    public void setSukNumber(String sukNumber) {
        this.sukNumber = sukNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Integer> getDeveloperIds() {
        return developerIds;
    }

    public void setDeveloperIds(List<Integer> developerIds) {
        this.developerIds = developerIds;
    }

    public String getForType() {
        return forType;
    }

    public void setForType(String forType) {
        this.forType = forType;
    }

}
