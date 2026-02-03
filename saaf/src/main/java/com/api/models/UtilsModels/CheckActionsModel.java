package com.api.models.UtilsModels;

public class CheckActionsModel {

    private String Endpoint;
    private Object body;


    public CheckActionsModel(String endpoint, Object body) {
        Endpoint = endpoint;
        this.body = body;
    }


    public CheckActionsModel() {
    }

    public String getEndpoint() {
        return Endpoint;
    }

    public void setEndpoint(String endpoint) {
        Endpoint = endpoint;
    }


    public Object getBody() {
        return body;
    }

    public void setBody(Object body) {
        this.body = body;
    }


}
