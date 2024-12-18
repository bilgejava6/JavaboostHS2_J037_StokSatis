package com.muhammet.entity;

public class Marka extends BaseEntity{
    private String markaAdi;
    private String aciklama;

    public Marka() {
    }

    public Marka(String markaAdi, String aciklama) {
        this.markaAdi = markaAdi;
        this.aciklama = aciklama;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Marka{");
        sb.append("markaAdi='").append(markaAdi).append('\'');
        sb.append(", aciklama='").append(aciklama).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public String getMarkaAdi() {
        return markaAdi;
    }

    public void setMarkaAdi(String markaAdi) {
        this.markaAdi = markaAdi;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }
}
