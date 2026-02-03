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

        // partial = 1  , Not_Received = 1
        // fully = 0 , Received = 0

        System.out.println("Validating Sell Project Request for PayType: " + request.getPayType() + ", SellType: " + request.getSellType());
        if(request.getPayType().equals("0") && request.getSellType().equals("0")){
           expected.isSold = true;
           expected.isLinked = true;
           expected.isClosed = false;
           expected.isReadyForUse = true;
           expected.isReinted = false;
           expected.hasSplitSetup = false;
           expected.canClose = true;
           expected.canSell = false;
           expected.canReint = false;
           expected.canReturnAdvance = false;
           expected.canDeliver = false;
           expected.canReceivePayment = false;
        }

        else if(request.getPayType().equals("0") && request.getSellType().equals("1")){

         System.out.println("Validating Sell Project Request for PayType: 0, SellType: 1");
           expected.isSold = true;
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
           expected.canReceivePayment = false;
        }
        else if(request.getPayType().equals("1") && request.getSellType().equals("0")){
           System.out.println("Validating Sell Project Request for PayType: 1, SellType: 0");
           expected.isSold = true;
           expected.isLinked = false;
           expected.isClosed = false;
           expected.isReadyForUse = true;
           expected.isReinted = false;
           expected.hasSplitSetup = false;
           expected.canClose = true;
           expected.canSell = true;
           expected.canReint = false;
           expected.canReturnAdvance = false;
           expected.canDeliver = false;
           expected.canReceivePayment = true;

        }

        else if (request.getPayType().equals("1") && request.getSellType().equals("1")) {

           System.out.println("Validating Sell Project Request for PayType: 1, SellType: 1");
           expected.isSold = true;
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
