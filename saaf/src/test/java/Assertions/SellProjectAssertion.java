package Assertions;

import org.testng.Assert;

import com.api.models.Response.RealEstateProjects.RealEstateProjectGetResponse;


public class SellProjectAssertion {
    
    
   
    public void assertActionsValues(RealEstateProjectGetResponse realEstateProjectGetResponse){

        Assert.assertEquals(realEstateProjectGetResponse.getActions().isLinked(), true);
         Assert.assertEquals(realEstateProjectGetResponse.getActions().isClosed(), false);
          Assert.assertEquals(realEstateProjectGetResponse.getActions().isReadyForUse(), false);
           Assert.assertEquals(realEstateProjectGetResponse.getActions().isSold(), true);
            Assert.assertEquals(realEstateProjectGetResponse.getActions().isReinted(), false);
             Assert.assertEquals(realEstateProjectGetResponse.getActions().hasSplitSetup(), false);
              Assert.assertEquals(realEstateProjectGetResponse.getActions().canClose(), false);
               Assert.assertEquals(realEstateProjectGetResponse.getActions().canSell(), false);
                Assert.assertEquals(realEstateProjectGetResponse.getActions().canReint(), false);
                 Assert.assertEquals(realEstateProjectGetResponse.getActions().canReturnAdvance(), true);
                  Assert.assertEquals(realEstateProjectGetResponse.getActions().canDeliver(), true);
                   Assert.assertEquals(realEstateProjectGetResponse.getActions().canReceivePayment(), true);
                


    }
}
