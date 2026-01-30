package Assertions;

import org.testng.Assert;

import com.api.BuissnessRules.SellRealEstateProjectRules;
import com.api.models.Response.RealEstateProjects.RealEstateProjectData;


public class SellProjectAssertion {
    


    public void assertActionsValues(RealEstateProjectData realEstateProjectGetResponse, SellRealEstateProjectRules expectedRules){

        Assert.assertEquals(realEstateProjectGetResponse.getActions().isLinked(), expectedRules.isLinked);
        Assert.assertEquals(realEstateProjectGetResponse.getActions().isClosed(), expectedRules.isClosed);
        Assert.assertEquals(realEstateProjectGetResponse.getActions().isReadyForUse(), expectedRules.isReadyForUse);
        Assert.assertEquals(realEstateProjectGetResponse.getActions().isSold(), expectedRules.isSold);
        Assert.assertEquals(realEstateProjectGetResponse.getActions().isReinted(), expectedRules.isReinted);
        Assert.assertEquals(realEstateProjectGetResponse.getActions().hasSplitSetup(), expectedRules.hasSplitSetup);
        Assert.assertEquals(realEstateProjectGetResponse.getActions().canClose(), expectedRules.canClose);
        Assert.assertEquals(realEstateProjectGetResponse.getActions().canSell(), expectedRules.canSell);
        Assert.assertEquals(realEstateProjectGetResponse.getActions().canReint(), expectedRules.canReint);
        Assert.assertEquals(realEstateProjectGetResponse.getActions().canReturnAdvance(), expectedRules.canReturnAdvance);
        Assert.assertEquals(realEstateProjectGetResponse.getActions().canDeliver(), expectedRules.canDeliver);
        Assert.assertEquals(realEstateProjectGetResponse.getActions().canReceivePayment(), expectedRules.canReceivePayment);

    }
}
