package com.wso2telco.dep.tpservice.model;

/**
 * Created by wso2telco(bmla) on 1/30/17.
 */
public class EmailDTO {

    private int whoId ;
    private String emailAddress;
    private int emailId;

    public int getEmailId() {
        return emailId;
    }

    public void setEmailId(int emailId) {
        this.emailId = emailId;
    }
    public int getWhoId() {
        return whoId;
    }

    public void setWhoId(int whoId) {
        this.whoId = whoId;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }



}