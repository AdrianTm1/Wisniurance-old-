package com.company.common;

public class AddressInforamation {
    private String streetName;
    private Integer streetNumber;
    private Integer flatNumber;
    private String zipCode;

    public AddressInforamation() {
    }

    public AddressInforamation(String streetName, Integer streetNumber, Integer flatNumber, String zipCode) {
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.flatNumber = flatNumber;
        this.zipCode = zipCode;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public Integer getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(Integer streetNumber) {
        this.streetNumber = streetNumber;
    }

    public Integer getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(Integer flatNumber) {
        this.flatNumber = flatNumber;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
