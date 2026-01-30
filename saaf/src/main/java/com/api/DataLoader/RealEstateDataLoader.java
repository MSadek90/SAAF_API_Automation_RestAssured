package com.api.DataLoader;

import com.api.Utils.JsonUtils;
import com.api.models.Request.RealEstateProjects.LinkedProjectToFundPostRequest;
import com.api.models.Request.RealEstateProjects.RealEstateProjectPostRequest;
import com.api.models.Request.RealEstateProjects.SellprojectPostRequest;

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

}
