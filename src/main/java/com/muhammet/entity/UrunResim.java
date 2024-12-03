package com.muhammet.entity;

public class UrunResim extends BaseEntity{
    private String resimUrl;
    private String urunId;
    private boolean anaResim;

    public UrunResim() {
    }

    public UrunResim(String resimUrl, String urunId, boolean anaResim) {
        this.resimUrl = resimUrl;
        this.urunId = urunId;
        this.anaResim = anaResim;
    }

    public String getResimUrl() {
        return resimUrl;
    }

    public void setResimUrl(String resimUrl) {
        this.resimUrl = resimUrl;
    }

    public String getUrunId() {
        return urunId;
    }

    public void setUrunId(String urunId) {
        this.urunId = urunId;
    }

    public boolean isAnaResim() {
        return anaResim;
    }

    public void setAnaResim(boolean anaResim) {
        this.anaResim = anaResim;
    }
}
