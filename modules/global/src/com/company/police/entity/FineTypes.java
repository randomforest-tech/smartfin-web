package com.company.police.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@NamePattern("%s|description")
@Table(name = "POLICE_FINE_TYPES")
@Entity(name = "police_FineTypes")
public class FineTypes extends StandardEntity {
    private static final long serialVersionUID = 4395524766143694981L;

    @Column(name = "CODE")
    protected String code;

    @Column(name = "DESCRIPTION")
    protected String description;

    @Column(name = "FINE")
    protected BigDecimal fine;

    public void setFine(BigDecimal fine) {
        this.fine = fine;
    }

    public BigDecimal getFine() {
        return fine;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}