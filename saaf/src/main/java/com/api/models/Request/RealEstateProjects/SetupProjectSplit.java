package com.api.models.Request.RealEstateProjects;

public class SetupProjectSplit {
    private int splitType;
    private int numberOfUnits;

    public int getSplitType() {
        return splitType;
    }

    public void setSplitType(int splitType) {
        this.splitType = splitType;
    }

    public int getNumberOfUnits() {
        return numberOfUnits;
    }

    public void setNumberOfUnits(int numberOfUnits) {
        this.numberOfUnits = numberOfUnits;
    }
}
