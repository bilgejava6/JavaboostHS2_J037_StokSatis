package com.muhammet.entity;

import java.math.BigDecimal;

public class Borc extends BaseEntity{
    private String musteriId;
    private BigDecimal toplamBorc;

    public Borc() {
    }

    public Borc(String musteriId, BigDecimal toplamBorc) {
        this.musteriId = musteriId;
        this.toplamBorc = toplamBorc;
    }

    public BigDecimal getToplamBorc() {
        return toplamBorc;
    }

    public void setToplamBorc(BigDecimal toplamBorc) {
        this.toplamBorc = toplamBorc;
    }

    public String getMusteriId() {
        return musteriId;
    }

    public void setMusteriId(String musteriId) {
        this.musteriId = musteriId;
    }
}
