package com.api.models.UtilsModels;



import com.api.Config.ConfigEnv;

public class EndpointModel {

    private String baseUrl;
    private String method;
    private String url = ConfigEnv.getBaseUrl();



    public EndpointModel(String baseUrl, String method) {
        this.baseUrl = baseUrl;
        this.method = method;
    }


    public String getBaseUrl() {
        return url + baseUrl;
    }
    public String getMethod() {
        return method;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public void setMethod(String method) {
        this.method = method;
    }
}
