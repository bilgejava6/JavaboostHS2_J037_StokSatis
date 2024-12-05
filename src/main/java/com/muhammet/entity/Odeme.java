package com.muhammet.entity;

import com.muhammet.entity.enums.OdemeTuru;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Odeme extends BaseEntity{
    private String musteriId;
    private BigDecimal odenen;
    private LocalDate date;
    private String aciklama;
    private OdemeTuru odemeTuru;

    public Odeme() {
    }

    public Odeme(OdemeTuru odemeTuru, String aciklama, LocalDate date, BigDecimal odenen, String musteriId) {
        this.odemeTuru = odemeTuru;
        this.aciklama = aciklama;
        this.date = date;
        this.odenen = odenen;
        this.musteriId = musteriId;
    }

    public String getMusteriId() {
        return musteriId;
    }

    public void setMusteriId(String musteriId) {
        this.musteriId = musteriId;
    }

    public BigDecimal getOdenen() {
        return odenen;
    }

    public void setOdenen(BigDecimal odenen) {
        this.odenen = odenen;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public OdemeTuru getOdemeTuru() {
        return odemeTuru;
    }

    public void setOdemeTuru(OdemeTuru odemeTuru) {
        this.odemeTuru = odemeTuru;
    }
}
