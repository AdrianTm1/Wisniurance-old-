package com.company.classes;

public class Company {
    private Integer id;
    private String NIP;
    private String REGON;
    private String representative;
    private String address;
    private String phone;

    public Company() {
    }

    public Company(Integer id, String NIP, String REGON, String representative, String address, String phone) {
        this.id = id;
        this.NIP = NIP;
        this.REGON = REGON;
        this.representative = representative;
        this.address = address;
        this.phone = phone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
