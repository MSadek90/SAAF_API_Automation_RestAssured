package com.api.models.Response.RealEstateProjects;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RealEstateProjectData {
    
    
     private int id;
    private String name;
    private String project_size;
    private String price_per_meter;
    private String total_price;
    private String total_development_cost;
    private String marketing_cost;
    private String suk_number;
    private String location;
    private String marketing_developer;
    private String funds;
    private boolean is_belongs_to_fund;
    private boolean is_split_setup;
    private String linked;
    private int total_cost;
    private String depreciation;
    private boolean has_depreciation;
    private int remaining_amount_to_pay;
    private String development_contract_url;
    private String marketing_contract_url;
    private int units_count;
    private int spv_section;
    private String property_owner_company_name;
    private String commercial_registration_number;
    private String vat_tax_number;
    private String available_for_reint;
    private ProjectActions actions;
    private String created_at;
    private String updated_at;

    // Getters & Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProject_size() {
        return project_size;
    }

    public void setProject_size(String project_size) {
        this.project_size = project_size;
    }

    public String getPrice_per_meter() {
        return price_per_meter;
    }

    public void setPrice_per_meter(String price_per_meter) {
        this.price_per_meter = price_per_meter;
    }

    public String getTotal_price() {
        return total_price;
    }

    public void setTotal_price(String total_price) {
        this.total_price = total_price;
    }

    public String getTotal_development_cost() {
        return total_development_cost;
    }

    public void setTotal_development_cost(String total_development_cost) {
        this.total_development_cost = total_development_cost;
    }

    public String getMarketing_cost() {
        return marketing_cost;
    }

    public void setMarketing_cost(String marketing_cost) {
        this.marketing_cost = marketing_cost;
    }

    public String getSuk_number() {
        return suk_number;
    }

    public void setSuk_number(String suk_number) {
        this.suk_number = suk_number;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    public String getMarketing_developer() {
        return marketing_developer;
    }

    public void setMarketing_developer(String marketing_developer) {
        this.marketing_developer = marketing_developer;
    }

    public String getFunds() {
        return funds;
    }

    public void setFunds(String funds) {
        this.funds = funds;
    }

    public boolean isIs_belongs_to_fund() {
        return is_belongs_to_fund;
    }

    public void setIs_belongs_to_fund(boolean is_belongs_to_fund) {
        this.is_belongs_to_fund = is_belongs_to_fund;
    }

    public boolean isIs_split_setup() {
        return is_split_setup;
    }

    public void setIs_split_setup(boolean is_split_setup) {
        this.is_split_setup = is_split_setup;
    }

    public String getLinked() {
        return linked;
    }

    public void setLinked(String linked) {
        this.linked = linked;
    }

    public int getTotal_cost() {
        return total_cost;
    }

    public void setTotal_cost(int total_cost) {
        this.total_cost = total_cost;
    }

    public String getDepreciation() {
        return depreciation;
    }

    public void setDepreciation(String depreciation) {
        this.depreciation = depreciation;
    }

    public boolean isHas_depreciation() {
        return has_depreciation;
    }

    public void setHas_depreciation(boolean has_depreciation) {
        this.has_depreciation = has_depreciation;
    }

    public int getRemaining_amount_to_pay() {
        return remaining_amount_to_pay;
    }

    public void setRemaining_amount_to_pay(int remaining_amount_to_pay) {
        this.remaining_amount_to_pay = remaining_amount_to_pay;
    }

    
    public String getDevelopment_contract_url() {
        return development_contract_url;
    }

    public void setDevelopment_contract_url(String development_contract_url) {
        this.development_contract_url = development_contract_url;
    }

    public String getMarketing_contract_url() {
        return marketing_contract_url;
    }

    public void setMarketing_contract_url(String marketing_contract_url) {
        this.marketing_contract_url = marketing_contract_url;
    }

    public int getUnits_count() {
        return units_count;
    }

    public void setUnits_count(int units_count) {
        this.units_count = units_count;
    }

    public int getSpv_section() {
        return spv_section;
    }

    public void setSpv_section(int spv_section) {
        this.spv_section = spv_section;
    }

    public String getProperty_owner_company_name() {
        return property_owner_company_name;
    }

    public void setProperty_owner_company_name(String property_owner_company_name) {
        this.property_owner_company_name = property_owner_company_name;
    }

    public String getCommercial_registration_number() {
        return commercial_registration_number;
    }

    public void setCommercial_registration_number(String commercial_registration_number) {
        this.commercial_registration_number = commercial_registration_number;
    }

    public String getVat_tax_number() {
        return vat_tax_number;
    }

    public void setVat_tax_number(String vat_tax_number) {
        this.vat_tax_number = vat_tax_number;
    }

    public String getAvailable_for_reint() {
        return available_for_reint;
    }

    public void setAvailable_for_reint(String available_for_reint) {
        this.available_for_reint = available_for_reint;
    }

    public ProjectActions getActions() {
        return actions;
    }

    public void setActions(ProjectActions actions) {
        this.actions = actions;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }
}
