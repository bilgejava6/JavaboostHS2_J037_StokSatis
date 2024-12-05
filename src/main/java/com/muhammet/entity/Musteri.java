package com.muhammet.entity;

import com.muhammet.entity.enums.MusteriState;

public class Musteri extends BaseEntity{
    private String ad;
    private String adres;
    private String telefon;
    private String avatar;
    private String userName;
    private String password;
    private MusteriState state;

    public Musteri() {
    }

    public Musteri(String ad, String adres, String telefon, String avatar, String userName, String password, MusteriState state) {
        this.ad = ad;
        this.adres = adres;
        this.telefon = telefon;
        this.avatar = avatar;
        this.userName = userName;
        this.password = password;
        this.state = state;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public MusteriState getState() {
        return state;
    }

    public void setState(MusteriState state) {
        this.state = state;
    }
}
