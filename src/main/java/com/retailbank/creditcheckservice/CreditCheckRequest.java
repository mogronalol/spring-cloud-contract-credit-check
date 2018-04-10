package com.retailbank.creditcheckservice;

public class CreditCheckRequest {
    private int citizenNumber;
    private String uuid;

    public int getCitizenNumber() {
        return citizenNumber;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public void setCitizenNumber(int citizenNumber) {
        this.citizenNumber = citizenNumber;
    }
}
