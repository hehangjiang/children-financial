package com.czb.train.childrenfinancial.entity;

import java.math.BigDecimal;

public class CardInf extends CardInfKey {
    private String idCard;

    private String cardNbr;

    private String cardProName;

    private String cardType;

    private String payPw;

    private BigDecimal amt;

    private BigDecimal baseRate;

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public String getCardNbr() {
        return cardNbr;
    }

    public void setCardNbr(String cardNbr) {
        this.cardNbr = cardNbr == null ? null : cardNbr.trim();
    }

    public String getCardProName() {
        return cardProName;
    }

    public void setCardProName(String cardProName) {
        this.cardProName = cardProName == null ? null : cardProName.trim();
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType == null ? null : cardType.trim();
    }

    public String getPayPw() {
        return payPw;
    }

    public void setPayPw(String payPw) {
        this.payPw = payPw == null ? null : payPw.trim();
    }

    public BigDecimal getAmt() {
        return amt;
    }

    public void setAmt(BigDecimal amt) {
        this.amt = amt;
    }

    public BigDecimal getBaseRate() {
        return baseRate;
    }

    public void setBaseRate(BigDecimal baseRate) {
        this.baseRate = baseRate;
    }
}