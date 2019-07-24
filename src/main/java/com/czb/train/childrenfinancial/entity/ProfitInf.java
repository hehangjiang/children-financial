package com.czb.train.childrenfinancial.entity;

import java.util.Date;

public class ProfitInf extends ProfitInfKey {
    private Boolean type;

    private Date addTime;

    public Boolean getType() {
        return type;
    }

    public void setType(Boolean type) {
        this.type = type;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}