package com.muhammet.repository;

import com.muhammet.entity.UrunResim;

import java.util.ArrayList;
import java.util.List;

public class UrunResimRepository implements Repository<UrunResim>{
    private static List<UrunResim> urunResimList = new ArrayList<>();
    public void save(UrunResim urunResim) {
        urunResimList.add(urunResim);
    }

    public void update(UrunResim urunResim) {

    }

    public void deleteById(String uuid) {

    }

    public UrunResim getById(String uuid) {
        return null;
    }

    public List<UrunResim> findAll() {
        return urunResimList;
    }
}
