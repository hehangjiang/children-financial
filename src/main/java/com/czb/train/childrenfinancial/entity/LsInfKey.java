package com.czb.train.childrenfinancial.entity;

public class LsInfKey {
    private String busiAcceptId;

    private String ownAcct;

    public String getBusiAcceptId() {
        return busiAcceptId;
    }

    public void setBusiAcceptId(String busiAcceptId) {
        this.busiAcceptId = busiAcceptId == null ? null : busiAcceptId.trim();
    }

    public String getOwnAcct() {
        return ownAcct;
    }

    public void setOwnAcct(String ownAcct) {
        this.ownAcct = ownAcct == null ? null : ownAcct.trim();
    }
}