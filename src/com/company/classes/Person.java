package com.company.classes;

public class Person {
    private Integer id;
    private String pesel;
    private String name;
    private String surname;
    private String address;
    private String phone;

    public Person() {
    }

    public Person(Integer id, String pesel, String name, String surname, String address, String phone) {
        this.id = id;
        this.pesel = pesel;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phone = phone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
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
