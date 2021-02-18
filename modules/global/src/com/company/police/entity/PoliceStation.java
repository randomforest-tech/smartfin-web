package com.company.police.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;

@NamePattern("%s|name")
@Table(name = "POLICE_POLICE_STATION")
@Entity(name = "police_PoliceStation")
public class PoliceStation extends StandardEntity {
    private static final long serialVersionUID = -6083871917211457013L;

    @Column(name = "NAME")
    protected String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PROVINCE_ID")
    protected Province province;

    @OnDeleteInverse(DeletePolicy.UNLINK)
    @OnDelete(DeletePolicy.UNLINK)
    @Lookup(type = LookupType.DROPDOWN)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DISTRICT_ID")
    protected District district;

    @Lob
    @Column(name = "ADDRESS")
    protected String address;

    @Column(name = "CONTACT_NO1")
    protected String contactNo1;

    @Column(name = "CONTACT_NO2")
    protected String contactNo2;

    public void setProvince(Province province) {
        this.province = province;
    }

    public Province getProvince() {
        return province;
    }

    public String getContactNo2() {
        return contactNo2;
    }

    public void setContactNo2(String contactNo2) {
        this.contactNo2 = contactNo2;
    }

    public String getContactNo1() {
        return contactNo1;
    }

    public void setContactNo1(String contactNo1) {
        this.contactNo1 = contactNo1;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDistrict(District district) {
        this.district = district;
    }

    public District getDistrict() {
        return district;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}