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

    public Urun getById(String uuid) {
        return null;
    }

    public List<Urun> findAll() {
        return urunList;
    }
}
