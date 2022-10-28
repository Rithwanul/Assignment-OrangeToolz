package com.orange.toolz.models;

public class UserDetails {

    private String firstName;
    private String lastName;
    private String city;
    private String province;
    private int postCode;
    private String mobileNumber;
    private String email;
    private String ip;

    public UserDetails(String firstName,
                       String lastName,
                       String city,
                       String province,
                       int postCode,
                       String mobileNumber,
                       String email, String ip) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.province = province;
        this.postCode = postCode;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.ip = ip;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return this.province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public int getPostCode() {
        return this.postCode;
    }

    public void setPostCode(int postCode) {
        this.postCode = postCode;
    }

    public String getMobileNumber() {
        return this.mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIp() {
        return this.ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName;
    }
}
