package com.api.models.UtilsModels;

public class CheckActionsModel {

    private String Endpoint;
    private int Actual_Result;
    private int Expected_Result;


    public CheckActionsModel(String endpoint, int actual_Result, int expected_Result) {
        Endpoint = endpoint;
        Actual_Result = actual_Result;
        Expected_Result = expected_Result;
    }


    public CheckActionsModel() {
    }

    public String getEndpoint() {
        return Endpoint;
    }

    public void setEndpoint(String endpoint) {
        Endpoint = endpoint;
    }

    public int getActual_Result() {
        return Actual_Result;
    }

    public void setActual_Result(int actual_Result) {
        Actual_Result = actual_Result;
    }

    public int getExpected_Result() {
        return Expected_Result;
    }

    public void setExpected_Result(int expected_Result) {
        Expected_Result = expected_Result;
    }

}
