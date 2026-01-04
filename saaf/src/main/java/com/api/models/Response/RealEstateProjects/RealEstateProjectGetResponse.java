package com.api.models.Response.RealEstateProjects;

public class RealEstateProjectGetResponse {
    private int id;
    private WrapperProjectActions actions;

     private boolean is_split_setup;

    // getters & setters

   


   public boolean isSplitSetup() {
    return is_split_setup;
}

    public void setSplitSetup(boolean splitSetup) {
        this.is_split_setup = splitSetup;
    }




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }




    public WrapperProjectActions getActions() {
        return actions;
    }

    public void setActions(WrapperProjectActions actions) {
        this.actions = actions;
    }

}
