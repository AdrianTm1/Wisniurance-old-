package com.company.classes;

import java.math.BigDecimal;
import java.util.Date;

public class Policy {
    private Integer id;
    private String insuranceHolder;
    private String insuredPerson;
    private String beneficiaryPerson;
    private String risks;
    private Date startDate;
    private Date endDate;
    private BigDecimal price;

    public Policy() {
    }

    public Policy(Integer id, String insuranceHolder, String insuredPerson, String beneficiaryPerson, String risks, Date startDate, Date endDate, BigDecimal price) {
        this.id = id;
        this.insuranceHolder = insuranceHolder;
        this.insuredPerson = insuredPerson;
        this.beneficiaryPerson = beneficiaryPerson;
        this.risks = risks;
        this.startDate = startDate;
        this.endDate = endDate;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInsuranceHolder() {
        return insuranceHolder;
    }

    public void setInsuranceHolder(String insuranceHolder) {
        this.insuranceHolder = insuranceHolder;
    }

    public String getInsuredPerson() {
        return insuredPerson;
    }

    public void setInsuredPerson(String insuredPerson) {
        this.insuredPerson = insuredPerson;
    }

    public String getBeneficiaryPerson() {
        return beneficiaryPerson;
    }

    public void setBeneficiaryPerson(String beneficiaryPerson) {
        this.beneficiaryPerson = beneficiaryPerson;
    }

    public String getRisks() {
        return risks;
    }

    public void setRisks(String risks) {
        this.risks = risks;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
