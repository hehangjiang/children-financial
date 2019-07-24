package com.czb.train.childrenfinancial.entity;

import java.math.BigDecimal;
import java.util.Date;

public class BusiInf extends BusiInfKey {
    private String finProductId;

    private BigDecimal amt;

    private Date updTime;

    public String getFinProductId() {
        return finProductId;
    }

    public void setFinProductId(String finProductId) {
        this.finProductId = finProductId == null ? null : finProductId.trim();
    }

    public BigDecimal getAmt() {
        return amt;
    }

    public void setAmt(BigDecimal amt) {
        this.amt = amt;
    }

    public Date getUpdTime() {
        return updTime;
    }

    public void setUpdTime(Date updTime) {
        this.updTime = updTime;
    }
}