package com.api.DataLoader;

import com.api.Utils.JsonUtils;
import com.api.models.Request.RealEstateProjects.LinkedProjectToFundPostRequest;
import com.api.models.Request.RealEstateProjects.RealEstateProjectPostRequest;
import com.api.models.Request.RealEstateProjects.ReceiveProjectPaymentRequest;
import com.api.models.Request.RealEstateProjects.SellprojectPostRequest;
import com.api.models.Response.RealEstateProjects.RealEstateProjectResponse;

public class RealEstateDataLoader {

    //saaf\src\main\java\com\api\models\Request\RealEstateProjects\LinkedProjectToFundPostRequest.java

    public static RealEstateProjectPostRequest projectLoadData() {
        RealEstateProjectPostRequest projectRequest = JsonUtils.fromJson(
            "src/test/java/resources/Request/RealEstate/RealEstateProjectRequest.json",
            RealEstateProjectPostRequest.class);
        return projectRequest;
    }




    public static LinkedProjectToFundPostRequest linkedProjectToFundLoadData() {
        LinkedProjectToFundPostRequest linkedProjectToFundRequest = JsonUtils.fromJson(
            "src/test/java/resources/Request/RealEstate/LinkProjectToFundRequest.json",
            LinkedProjectToFundPostRequest.class);
        return linkedProjectToFundRequest;
    }


  





    public static SellprojectPostRequest sellProjectLoadData() {
        SellprojectPostRequest sellProjectRequest = JsonUtils.fromJson(
            "src/test/java/resources/Request/RealEstate/SellProjectRequest.json",
            SellprojectPostRequest.class);
        return sellProjectRequest;
    }




    public ReceiveProjectPaymentRequest receiveProjectPaymentLoadData() {
        ReceiveProjectPaymentRequest receiveProjectPaymentRequest = JsonUtils.fromJson(
            "src/test/java/resources/Request/RealEstate/ReceivePaymentForSellingProject.json",
            ReceiveProjectPaymentRequest.class);
        return receiveProjectPaymentRequest;
    }
}
