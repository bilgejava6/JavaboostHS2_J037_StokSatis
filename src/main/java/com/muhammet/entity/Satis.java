package com.muhammet.entity;

import com.muhammet.entity.enums.OdemeTuru;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Satis extends BaseEntity{
    private String musteriId;
    private LocalDateTime tarih;
    private BigDecimal toplamTutar;
    private BigDecimal odenen;
    private BigDecimal kalan;
    private OdemeTuru odemeTuru;

    public Satis() {
    }

    public Satis(String musteriId, LocalDateTime tarih, BigDecimal toplamTutar, BigDecimal odenen, BigDecimal kalan, OdemeTuru odemeTuru) {
        this.musteriId = musteriId;
        this.tarih = tarih;
        this.toplamTutar = toplamTutar;
        this.odenen = odenen;
        this.kalan = kalan;
        this.odemeTuru = odemeTuru;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Satis{");
        sb.append("musteriId='").append(musteriId).append('\'');
        sb.append(", tarih=").append(tarih);
        sb.append(", toplamTutar=").append(toplamTutar);
        sb.append(", odenen=").append(odenen);
        sb.append(", kalan=").append(kalan);
        sb.append(", odemeTuru=").append(odemeTuru);
        sb.append('}');
        return sb.toString();
    }

    public String getMusteriId() {
        return musteriId;
    }

    public void setMusteriId(String musteriId) {
        this.musteriId = musteriId;
    }

    public LocalDateTime getTarih() {
        return tarih;
    }

    public void setTarih(LocalDateTime tarih) {
        this.tarih = tarih;
    }

    public BigDecimal getToplamTutar() {
        return toplamTutar;
    }

    public void setToplamTutar(BigDecimal toplamTutar) {
        this.toplamTutar = toplamTutar;
    }

    public BigDecimal getOdenen() {
        return odenen;
    }

    public void setOdenen(BigDecimal odenen) {
        this.odenen = odenen;
    }

    public BigDecimal getKalan() {
        return kalan;
    }

    public void setKalan(BigDecimal kalan) {
        this.kalan = kalan;
    }

    public OdemeTuru getOdemeTuru() {
        return odemeTuru;
    }

    public void setOdemeTuru(OdemeTuru odemeTuru) {
        this.odemeTuru = odemeTuru;
    }
}
