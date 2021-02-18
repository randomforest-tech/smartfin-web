package com.company.police.entity;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import java.time.LocalDateTime;

@Table(name = "POLICE_FINE_SHEET")
@Entity(name = "police_FineSheet")
public class FineSheet extends StandardEntity {
    private static final long serialVersionUID = -3542133648138965642L;

    @Column(name = "BOOK_NO")
    protected String bookNo;

    @Column(name = "SERIAL_START_NO")
    protected Long serialStartNo;

    @Column(name = "SERIAL_END_NUMBER")
    protected Long serialEndNumber;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "POLICE_STATION_ID")
    protected PoliceStation policeStation;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ISSUED_TO_ID")
    protected Officer issuedTo;

    @Column(name = "ISSUED_DATE")
    protected LocalDateTime issuedDate;

    @OnDelete(DeletePolicy.UNLINK)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ISSUED_BY_ID")
    protected Officer issuedBy;

    public Officer getIssuedBy() {
        return issuedBy;
    }

    public void setIssuedBy(Officer issuedBy) {
        this.issuedBy = issuedBy;
    }

    public LocalDateTime getIssuedDate() {
        return issuedDate;
    }

    public void setIssuedDate(LocalDateTime issuedDate) {
        this.issuedDate = issuedDate;
    }

    public Officer getIssuedTo() {
        return issuedTo;
    }

    public void setIssuedTo(Officer issuedTo) {
        this.issuedTo = issuedTo;
    }

    public PoliceStation getPoliceStation() {
        return policeStation;
    }

    public void setPoliceStation(PoliceStation policeStation) {
        this.policeStation = policeStation;
    }

    public Long getSerialEndNumber() {
        return serialEndNumber;
    }

    public void setSerialEndNumber(Long serialEndNumber) {
        this.serialEndNumber = serialEndNumber;
    }

    public Long getSerialStartNo() {
        return serialStartNo;
    }

    public void setSerialStartNo(Long serialStartNo) {
        this.serialStartNo = serialStartNo;
    }

    public String getBookNo() {
        return bookNo;
    }

    public void setBookNo(String bookNo) {
        this.bookNo = bookNo;
    }
}