package com.czb.train.childrenfinancial.entity;

import java.math.BigDecimal;
import java.util.Date;

public class LsInf extends LsInfKey {
    private String status;

    private BigDecimal amt;

    private Long remainAmt;

    private String yourAcct;

    private Date addTime;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public BigDecimal getAmt() {
        return amt;
    }

    public void setAmt(BigDecimal amt) {
        this.amt = amt;
    }

    public Long getRemainAmt() {
        return remainAmt;
    }

    public void setRemainAmt(Long remainAmt) {
        this.remainAmt = remainAmt;
    }

    public String getYourAcct() {
        return yourAcct;
    }

    public void setYourAcct(String yourAcct) {
        this.yourAcct = yourAcct == null ? null : yourAcct.trim();
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}