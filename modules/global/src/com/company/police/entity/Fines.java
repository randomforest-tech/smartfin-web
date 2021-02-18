package com.company.police.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@NamePattern("%s %s|fineType,fine")
@Table(name = "POLICE_FINES")
@Entity(name = "police_Fines")
public class Fines extends StandardEntity {
    private static final long serialVersionUID = -1734374039814731867L;

    @Column(name = "DRIVING_LICENSE_NO")
    protected String drivingLicenseNo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ISSUED_BY_ID")
    protected Officer issuedBy;

    @Column(name = "ISSUED_TIME")
    protected LocalDateTime issuedTime;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FINE_TYPE_ID")
    protected FineTypes fineType;

    @Column(name = "FINE")
    protected BigDecimal fine;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "POLICE_STATION_ID")
    protected PoliceStation policeStation;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PROVINCE_ID")
    protected Province province;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DISTRICT_ID")
    protected District district;

    @Column(name = "LONGITUDE")
    protected String longitude;

    @Column(name = "LATITUDE")
    protected String latitude;

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public BigDecimal getFine() {
        return fine;
    }

    public void setFine(BigDecimal fine) {
        this.fine = fine;
    }

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }

    public PoliceStation getPoliceStation() {
        return policeStation;
    }

    public void setPoliceStation(PoliceStation policeStation) {
        this.policeStation = policeStation;
    }

    public FineTypes getFineType() {
        return fineType;
    }

    public void setFineType(FineTypes fineType) {
        this.fineType = fineType;
    }

    public LocalDateTime getIssuedTime() {
        return issuedTime;
    }

    public void setIssuedTime(LocalDateTime issuedTime) {
        this.issuedTime = issuedTime;
    }

    public Officer getIssuedBy() {
        return issuedBy;
    }

    public void setIssuedBy(Officer issuedBy) {
        this.issuedBy = issuedBy;
    }

    public String getDrivingLicenseNo() {
        return drivingLicenseNo;
    }

    public void setDrivingLicenseNo(String drivingLicenseNo) {
        this.drivingLicenseNo = drivingLicenseNo;
    }
}