package com.company.police.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@NamePattern("%s|description")
@Table(name = "POLICE_POLICE_RANK")
@Entity(name = "police_PoliceRank")
public class PoliceRank extends StandardEntity {
    private static final long serialVersionUID = 9066415198027343945L;

    @Column(name = "CODE")
    protected String code;

    @Column(name = "DESCRIPTION")
    protected String description;

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