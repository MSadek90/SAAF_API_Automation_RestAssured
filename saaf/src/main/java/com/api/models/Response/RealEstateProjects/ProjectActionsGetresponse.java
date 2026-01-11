package com.api.models.Response.RealEstateProjects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProjectActionsGetresponse {
     @JsonProperty("is_linked")
    private boolean isLinked;

    @JsonProperty("is_closed")
    private boolean isClosed;

    @JsonProperty("is_ready_for_use")
    private boolean isReadyForUse;

    @JsonProperty("is_sold")
    private boolean isSold;

    @JsonProperty("is_reinted")
    private boolean isReinted;

    @JsonProperty("has_split_setup")
    private boolean hasSplitSetup;

    @JsonProperty("can_close")
    private boolean canClose;

    @JsonProperty("can_ready_for_use")
    private boolean canReadyForUse;

    @JsonProperty("can_setup_split")
    private boolean canSetupSplit;

    @JsonProperty("can_sell")
    private boolean canSell;

    @JsonProperty("can_reint")
    private boolean canReint;

    @JsonProperty("can_return_advance")
    private boolean canReturnAdvance;

    @JsonProperty("can_deliver")
    private boolean canDeliver;

    @JsonProperty("can_receive_payment")
    private boolean canReceivePayment;

    @JsonProperty("can_pay_sell")
    private boolean canPaySell;

    @JsonProperty("can_pay_reint")
    private boolean canPayReint;

    // getters & setters
    public boolean isLinked() {
    return isLinked;
}

public void setLinked(boolean linked) {
    this.isLinked = linked;
}

public boolean isClosed() {
    return isClosed;
}

public void setClosed(boolean closed) {
    this.isClosed = closed;
}

public boolean isReadyForUse() {
    return isReadyForUse;
}

public void setReadyForUse(boolean readyForUse) {
    this.isReadyForUse = readyForUse;
}

public boolean isSold() {
    return isSold;
}

public void setSold(boolean sold) {
    this.isSold = sold;
}

public boolean isReinted() {
    return isReinted;
}

public void setReinted(boolean reinted) {
    this.isReinted = reinted;
}

public boolean hasSplitSetup() {
    return hasSplitSetup;
}

public void setHasSplitSetup(boolean hasSplitSetup) {
    this.hasSplitSetup = hasSplitSetup;
}

public boolean canClose() {
    return canClose;
}

public void setCanClose(boolean canClose) {
    this.canClose = canClose;
}

public boolean canReadyForUse() {
    return canReadyForUse;
}

public void setCanReadyForUse(boolean canReadyForUse) {
    this.canReadyForUse = canReadyForUse;
}

public boolean canSetupSplit() {
    return canSetupSplit;
}

public void setCanSetupSplit(boolean canSetupSplit) {
    this.canSetupSplit = canSetupSplit;
}

public boolean canSell() {
    return canSell;
}

public void setCanSell(boolean canSell) {
    this.canSell = canSell;
}

public boolean canReint() {
    return canReint;
}

public void setCanReint(boolean canReint) {
    this.canReint = canReint;
}

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

public boolean canPaySell() {
    return canPaySell;
}

public void setCanPaySell(boolean canPaySell) {
    this.canPaySell = canPaySell;
}

public boolean canPayReint() {
    return canPayReint;
}

public void setCanPayReint(boolean canPayReint) {
    this.canPayReint = canPayReint;
}


}
