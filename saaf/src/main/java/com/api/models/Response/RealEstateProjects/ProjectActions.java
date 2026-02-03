package com.api.models.Response.RealEstateProjects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.api.annotations.RealEstateProjectsActionsConfig;
import com.api.models.Request.RealEstateProjects.ReceiveProjectPaymentRequest;
import com.api.models.Request.RealEstateProjects.SetupProjectSplit;





@JsonIgnoreProperties(ignoreUnknown = true)
public class ProjectActions {
   

    @RealEstateProjectsActionsConfig(endpoint = "project-phase")
    @JsonProperty("can_ready_for_use")
    private boolean canReadyForUse;


    @RealEstateProjectsActionsConfig(endpoint = "return-advance")
    @JsonProperty("can_return_advance")
    private boolean canReturnAdvance;


    @RealEstateProjectsActionsConfig(endpoint = "deliver")
    @JsonProperty("can_deliver")
    private boolean canDeliver;

    @RealEstateProjectsActionsConfig(endpoint = "receive-payment", requestBody = ReceiveProjectPaymentRequest.class)
    @JsonProperty("can_receive_payment")
    private boolean canReceivePayment;

   /*  @RealEstateProjectsActionsConfig(endpoint = "split-setup", requestBody = SetupProjectSplit.class)
    @JsonProperty("can_setup_split")
    private boolean canSetupSplit;*/


    public boolean canReadyForUse() {
        return canReadyForUse;
    }

    public void setCanReadyForUse(boolean canReadyForUse) {
        this.canReadyForUse = canReadyForUse;
    }

    /* 
    public boolean canSetupSplit() {
        return canSetupSplit;
    }

    public void setCanSetupSplit(boolean canSetupSplit) {
        this.canSetupSplit = canSetupSplit;
    }

    */
    public boolean canReturnAdvance() {
        return canReturnAdvance;
    }

    public void setCanReturnAdvance(boolean canReturnAdvance) {
        this.canReturnAdvance = canReturnAdvance;
    }

    public boolean canDeliver() {
        return canDeliver;
    }

    public void setCanDeliver(boolean canDeliver) {
        this.canDeliver = canDeliver;
    }

    public boolean canReceivePayment() {
        return canReceivePayment;
    }

    public void setCanReceivePayment(boolean canReceivePayment) {
        this.canReceivePayment = canReceivePayment;
    }

}
