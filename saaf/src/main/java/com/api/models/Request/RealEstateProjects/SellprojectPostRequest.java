package com.api.models.Request.RealEstateProjects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SellprojectPostRequest {

    
    @JsonProperty("selling_price")
    private String sellingPrice;

    @JsonProperty("pay_type")
    private String payType;

    @JsonProperty("sell_type")
    private String sellType;

    @JsonProperty("selling_date")
    private String sellingDate;

    @JsonProperty("paid_amount")
    private String paidAmount;

    @JsonProperty("vat")
    private String vat;
    // Getters and Setters
    public String getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(String sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getSellType() {
        return sellType;
    }

    public void setSellType(String sellType) {
        this.sellType = sellType;
    }

    public String getSellingDate() {
        return sellingDate;
    }

    public void setSellingDate(String sellingDate) {
        this.sellingDate = sellingDate;
    }

    public String getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(String paidAmount) {
        this.paidAmount = paidAmount;
    }

    public String getVat() {
        return vat;
    }

    public void setVat(String vat) {
        this.vat = vat;
    }
}
