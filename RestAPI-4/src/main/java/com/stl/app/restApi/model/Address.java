package com.stl.app.restApi.model;

public class Address {
    private PermanentAddress permanentAddress;
    private CurrentAddress currentAddress;
    public PermanentAddress getPermanentAddress() {
        return permanentAddress;
    }
    public void setPermanentAddress(PermanentAddress permanentAddress) {
        this.permanentAddress = permanentAddress;
    }
    public CurrentAddress getCurrentAddress() {
        return currentAddress;
    }
    public void setCurrentAddress(CurrentAddress currentAddress) {
        this.currentAddress = currentAddress;
    }

}
