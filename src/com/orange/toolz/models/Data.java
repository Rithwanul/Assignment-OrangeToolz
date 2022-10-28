package com.orange.toolz.models;

import com.orange.toolz.service.ValidatorService;

public class Data {

    private ValidatorService service;
    private int tokenNumber;
    private String userDetails;
    private int availableProcessors;

    public Data() {
    }

    public Data(ValidatorService service, int tokenNumber, String userDetails) {
        this.service = service;
        this.tokenNumber = tokenNumber;
        this.userDetails = userDetails;
    }

    public int getAvailableProcessors() {
        return this.availableProcessors;
    }

    public void setAvailableProcessors(int availableProcessors) {
        this.availableProcessors = availableProcessors;
    }

    public ValidatorService getService() {
        return this.service;
    }

    public void setService(ValidatorService service) {
        this.service = service;
    }

    public int getTokenNumber() {
        return this.tokenNumber;
    }

    public void setTokenNumber(int tokenNumber) {
        this.tokenNumber = tokenNumber;
    }

    public String getUserDetails() {
        return this.userDetails;
    }

    public void setUserDetails(String userDetails) {
        this.userDetails = userDetails;
    }
}
