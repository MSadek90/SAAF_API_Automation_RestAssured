package com.api.models.Response.RealEstateProjects;

public class RealEstateProjectGetResponse {
    
    
    private int id;
    private ProjectActionsGetresponse actions;
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




    public ProjectActionsGetresponse getActions() {
        return actions;
    }

    public void setActions(ProjectActionsGetresponse actions) {
        this.actions = actions;
    }

}
