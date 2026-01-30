package com.api.BuissnessRules;

import com.api.models.Request.RealEstateProjects.SellprojectPostRequest;

public class SellRealEstateProjectRules {


    public boolean isSold;
    public boolean canDeliver;
    public boolean canReceivePayment;
    public boolean canReturnAdvance;
    public boolean isLinked;
    public boolean isClosed;
    public boolean isReadyForUse;
    public boolean isReinted;
    public boolean hasSplitSetup;
    public boolean canClose;
    public boolean canSell;
    public boolean canReint;
    

    public static SellRealEstateProjectRules validateSellProjectRequest(SellprojectPostRequest request) {

        SellRealEstateProjectRules expected = new SellRealEstateProjectRules();

        if(request.getPayType().equals("0") && request.getSellType().equals("0")){
           expected.isSold = true;
           expected.canDeliver = true;
           expected.canReceivePayment = true;
           expected.canReturnAdvance = true;
           expected.isLinked = true;
           expected.isClosed = false;
           expected.isReadyForUse = true;
           expected.isReinted = false;
           expected.hasSplitSetup = false;
           expected.canClose = true;
           expected.canSell = true;
           expected.canReint = false;
           expected.canReturnAdvance = true;
           expected.canDeliver = true;
           expected.canReceivePayment = true;
        }

        else if(request.getPayType() == "0" && request.getSellType() == "1"){

           expected.isSold = true;
           expected.canDeliver = true;
           expected.canReceivePayment = true;
           expected.canReturnAdvance = true;
           expected.isLinked = true;
           expected.isClosed = false;
           expected.isReadyForUse = true;
           expected.isReinted = false;
           expected.hasSplitSetup = false;
           expected.canClose = true;
           expected.canSell = true;
           expected.canReint = false;
           expected.canReturnAdvance = true;
           expected.canDeliver = true;
           expected.canReceivePayment = true;
        }
        else if(request.getPayType() == "1" && request.getSellType() == "0"){

           expected.isSold = true;
           expected.canDeliver = false;
           expected.canReceivePayment = false;
           expected.canReturnAdvance = true;
           expected.isLinked = false;
           expected.isClosed = false;
           expected.isReadyForUse = true;
           expected.isReinted = false;
           expected.hasSplitSetup = false;
           expected.canClose = true;
           expected.canSell = true;
           expected.canReint = false;
           expected.canReturnAdvance = true;
           expected.canDeliver = true;
           expected.canReceivePayment = true;

        }

        else if (request.getPayType() == "1" && request.getSellType() == "1") {

           expected.isSold = true;
           expected.canDeliver = false;
           expected.canReceivePayment = false;
           expected.canReturnAdvance = true;
           expected.isLinked = false;
           expected.isClosed = false;
           expected.isReadyForUse = true;
           expected.isReinted = false;
           expected.hasSplitSetup = false;
           expected.canClose = true;
           expected.canSell = true;
           expected.canReint = false;
           expected.canReturnAdvance = true;
           expected.canDeliver = true;
           expected.canReceivePayment = true;

        }
        return expected;

    }

}
