package com.api.models.Response.RealEstateProjects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RealEstateProjectData {

    private int id;
    private String name;
    private String project_size;
    private String price_per_meter;
    private String total_price;
    private ProjectActions actions;

    // Getters & Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProject_size() {
        return project_size;
    }

    public void setProject_size(String project_size) {
        this.project_size = project_size;
    }

    public String getPrice_per_meter() {
        return price_per_meter;
    }

    public void setPrice_per_meter(String price_per_meter) {
        this.price_per_meter = price_per_meter;
    }

    public String getTotal_price() {
        return total_price;
    }

    public void setTotal_price(String total_price) {
        this.total_price = total_price;
    }

    public ProjectActions getActions() {
        return actions;
    }

    public void setActions(ProjectActions actions) {
        this.actions = actions;
    }
}