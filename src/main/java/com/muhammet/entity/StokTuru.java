package com.muhammet.entity;

public class StokTuru extends BaseEntity{
    private String stokTuru;

    public StokTuru() {
    }
    public StokTuru(String stokTuru) {
        this.stokTuru = stokTuru;
    }

    public String getStokTuru() {
        return stokTuru;
    }

    public void setStokTuru(String stokTuru) {
        this.stokTuru = stokTuru;
    }
}
