package com.muhammet.entity;

public class Model extends BaseEntity{
    private String markaId;
    private String modelAd;

    public Model() {
    }

    public Model(String markaId, String modelAd) {
        this.markaId = markaId;
        this.modelAd = modelAd;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Model{");
        sb.append("markaId='").append(markaId).append('\'');
        sb.append(", modelAd='").append(modelAd).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public String getMarkaId() {
        return markaId;
    }

    public void setMarkaId(String markaId) {
        this.markaId = markaId;
    }

    public String getModelAd() {
        return modelAd;
    }

    public void setModelAd(String modelAd) {
        this.modelAd = modelAd;
    }
}
