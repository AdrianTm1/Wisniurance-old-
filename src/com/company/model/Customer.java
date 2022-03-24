package com.company.model;

import com.company.common.AddressInforamation;

public abstract class Customer {

    private Integer id;
    private AddressInforamation address;
    private String phone;

    public Customer() {
    }

    public Customer(Integer id, AddressInforamation address, String phone) {
        this.id = id;
        this.address = address;
        this.phone = phone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public AddressInforamation getAddress() {
        return address;
    }

    public void setAddress(AddressInforamation address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
