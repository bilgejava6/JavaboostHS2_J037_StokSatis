package com.muhammet.entity;

import java.math.BigDecimal;

public class SatisDetay extends BaseEntity{
    private String urunId;
    private String satisId;
    private BigDecimal birimFiyat;
    private int adet;
    private BigDecimal toplamTutar;

    public SatisDetay() {
    }

    public SatisDetay(String urunId, String satisId, BigDecimal birimFiyat, int adet, BigDecimal toplamTutar) {
        this.urunId = urunId;
        this.satisId = satisId;
        this.birimFiyat = birimFiyat;
        this.adet = adet;
        this.toplamTutar = toplamTutar;
    }

    public String getUrunId() {
        return urunId;
    }

    public void setUrunId(String urunId) {
        this.urunId = urunId;
    }

    public String getSatisId() {
        return satisId;
    }

    public void setSatisId(String satisId) {
        this.satisId = satisId;
    }

    public BigDecimal getBirimFiyat() {
        return birimFiyat;
    }

    public void setBirimFiyat(BigDecimal birimFiyat) {
        this.birimFiyat = birimFiyat;
    }

    public int getAdet() {
        return adet;
    }

    public void setAdet(int adet) {
        this.adet = adet;
    }

    public BigDecimal getToplamTutar() {
        return toplamTutar;
    }

    public void setToplamTutar(BigDecimal toplamTutar) {
        this.toplamTutar = toplamTutar;
    }
}
