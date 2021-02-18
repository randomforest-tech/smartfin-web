package com.company.police.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;

@NamePattern("%s|fullName")
@Table(name = "POLICE_OFFICER")
@Entity(name = "police_Officer")
public class Officer extends StandardEntity {
    private static final long serialVersionUID = 2071748637002200223L;

    @Column(name = "POLICE_ID")
    protected String policeID;

    @Column(name = "FULL_NAME")
    protected String fullName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "RANK_ID")
    protected PoliceRank rank;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "POLICE_STATION_ID")
    protected PoliceStation policeStation;

    @Lob
    @Column(name = "ADDRESS")
    protected String address;

    @Column(name = "MOBILE")
    protected String mobile;

    @Column(name = "HOME_PHONE")
    protected String homePhone;

    @Column(name = "OFFICE_PHONE1")
    protected String officePhone1;

    @Column(name = "OFFICE_PHONE2")
    protected String officePhone2;

    public void setPoliceStation(PoliceStation policeStation) {
        this.policeStation = policeStation;
    }

    public PoliceStation getPoliceStation() {
        return policeStation;
    }

    public void setRank(PoliceRank rank) {
        this.rank = rank;
    }

    public PoliceRank getRank() {
        return rank;
    }

    public String getPoliceID() {
        return policeID;
    }

    public void setPoliceID(String policeID) {
        this.policeID = policeID;
    }

    public String getOfficePhone2() {
        return officePhone2;
    }

    public void setOfficePhone2(String officePhone2) {
        this.officePhone2 = officePhone2;
    }

    public String getOfficePhone1() {
        return officePhone1;
    }

    public void setOfficePhone1(String officePhone1) {
        this.officePhone1 = officePhone1;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}