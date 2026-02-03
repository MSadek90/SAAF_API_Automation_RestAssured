package Assertions;

import org.testng.Assert;

import com.api.BuissnessRules.SellRealEstateProjectRules;
import com.api.models.Response.RealEstateProjects.RealEstateProjectResponse;


public class SellProjectAssertion {
    


    public void assertActionsValues(RealEstateProjectResponse response, SellRealEstateProjectRules expectedRules){
       /*  Assert.assertEquals(realEstateProjectData.getActions().isLinked(), expectedRules.isLinked);
        Assert.assertEquals(realEstateProjectData.getActions().isClosed(), expectedRules.isClosed);
        Assert.assertEquals(realEstateProjectData.getActions().isReadyForUse(), expectedRules.isReadyForUse);
        Assert.assertEquals(realEstateProjectData.getActions().isSold(), expectedRules.isSold);
        Assert.assertEquals(realEstateProjectData.getActions().isReinted(), expectedRules.isReinted);
        Assert.assertEquals(realEstateProjectData.getActions().hasSplitSetup(), expectedRules.hasSplitSetup);
        Assert.assertEquals(realEstateProjectData.getActions().canClose(), expectedRules.canClose);
        Assert.assertEquals(response.getActions().canSell(), expectedRules.canSell());
        Assert.assertEquals(response.getActions().canReint(), expectedRules.canReint());*/
        Assert.assertEquals(response.getData().getActions().canReturnAdvance(), expectedRules.canReturnAdvance);
        Assert.assertEquals(response.getData().getActions().canDeliver(), expectedRules.canDeliver);
        Assert.assertEquals(response.getData().getActions().canReceivePayment(), expectedRules.canReceivePayment);
    }
}
