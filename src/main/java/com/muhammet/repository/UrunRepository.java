package com.muhammet.repository;

import com.muhammet.entity.Urun;

import java.util.ArrayList;
import java.util.List;

public class UrunRepository implements Repository<Urun>{
    private static List<Urun> urunList = new ArrayList<>();
    public void save(Urun urun) {
        urunList.add(urun);
    }

    public void update(Urun urun) {

    }

    public void deleteById(String uuid) {

    }

    public String getUrunAdiById(String uuid){
        String urunAdi = null;
        for(Urun urun : urunList){
            if (urun.getUuid().equals(uuid)){
                urunAdi = urun.getAd();
                break;
            }
        }
        return urunAdi;
        //return urunList.stream().filter(x-> x.getUuid().equals(uuid)).findFirst().get().getAd();
    }

    public Urun getById(String uuid) {
        return null;
    }

    public List<Urun> findAll() {
        return urunList;
    }
}
