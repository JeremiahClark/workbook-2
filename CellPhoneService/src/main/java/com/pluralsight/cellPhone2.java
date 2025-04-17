package com.pluralsight;

import java.util.Scanner;

public class cellPhone2 {

    private String owner;
    private String phoneNumber;
    private String model;
    private String carrier;
    private long serialNumber;

    // Setters
    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public void setSerialNumber(long serialNumber) {
        this.serialNumber = serialNumber;
    }

    // Getters
    public String getOwner() {
        return owner;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getModel() {
        return model;
    }

    public String getCarrier() {
        return carrier;
    }

    public long getSerialNumber() {
        return serialNumber;
    }
}


