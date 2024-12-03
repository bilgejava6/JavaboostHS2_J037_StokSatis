package com.muhammet.entity;

import java.math.BigDecimal;

public class Urun extends BaseEntity{
    private String ad;
    private String aciklama;
    private BigDecimal fiyat;
    private int kdv;
    private int stokAdedi;
    private String stokTurId;
    private int uyariMiktari;
    private String modelId;

    public Urun() {
    }

    public Urun(String ad, String aciklama, BigDecimal fiyat, int kdv, int stokAdedi, String stokTurId, int uyariMiktari, String modelId) {
        this.ad = ad;
        this.aciklama = aciklama;
        this.fiyat = fiyat;
        this.kdv = kdv;
        this.stokAdedi = stokAdedi;
        this.stokTurId = stokTurId;
        this.uyariMiktari = uyariMiktari;
        this.modelId = modelId;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public BigDecimal getFiyat() {
        return fiyat;
    }

    public void setFiyat(BigDecimal fiyat) {
        this.fiyat = fiyat;
    }

    public int getKdv() {
        return kdv;
    }

    public void setKdv(int kdv) {
        this.kdv = kdv;
    }

    public int getStokAdedi() {
        return stokAdedi;
    }

    public void setStokAdedi(int stokAdedi) {
        this.stokAdedi = stokAdedi;
    }

    public String getStokTurId() {
        return stokTurId;
    }

    public void setStokTurId(String stokTurId) {
        this.stokTurId = stokTurId;
    }

    public int getUyariMiktari() {
        return uyariMiktari;
    }

    public void setUyariMiktari(int uyariMiktari) {
        this.uyariMiktari = uyariMiktari;
    }

    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }
}
