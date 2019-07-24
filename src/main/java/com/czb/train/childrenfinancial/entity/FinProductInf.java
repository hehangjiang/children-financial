package com.czb.train.childrenfinancial.entity;

import java.math.BigDecimal;
import java.util.Date;

public class FinProductInf {
    private String productId;

    private String settleCardnbr;

    private String productName;

    private BigDecimal startAmt;

    private BigDecimal endAmt;

    private Date endDate;

    private BigDecimal rate;

    private Byte shortestPeriod;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public String getSettleCardnbr() {
        return settleCardnbr;
    }

    public void setSettleCardnbr(String settleCardnbr) {
        this.settleCardnbr = settleCardnbr == null ? null : settleCardnbr.trim();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public BigDecimal getStartAmt() {
        return startAmt;
    }

    public void setStartAmt(BigDecimal startAmt) {
        this.startAmt = startAmt;
    }

    public BigDecimal getEndAmt() {
        return endAmt;
    }

    public void setEndAmt(BigDecimal endAmt) {
        this.endAmt = endAmt;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public Byte getShortestPeriod() {
        return shortestPeriod;
    }

    public void setShortestPeriod(Byte shortestPeriod) {
        this.shortestPeriod = shortestPeriod;
    }
}