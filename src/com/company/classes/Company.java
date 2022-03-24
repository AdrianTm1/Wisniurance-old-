package com.company.classes;

import com.company.common.AddressInforamation;
import com.company.model.Customer;

public class Company extends Customer {
    private String NIP;
    private String REGON;
    private String representative;

    public Company() {
    }

    public Company(int id, String NIP, String REGON, String representative, AddressInforamation address, String phone) {
        super(id, address, phone);
        this.NIP = NIP;
        this.REGON = REGON;
        this.representative = representative;

    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public String getREGON() {
        return REGON;
    }

    public void setREGON(String REGON) {
        this.REGON = REGON;
    }

    public String getRepresentative() {
        return representative;
    }

    public void setRepresentative(String representative) {
        this.representative = representative;
    }

}
