package com.muhammet.repository;

import com.muhammet.entity.StokTuru;

import java.util.ArrayList;
import java.util.List;

public class StokTuruRepository implements Repository<StokTuru>{
    private static List<StokTuru> stokTuruList = new ArrayList<>();
    public void save(StokTuru stokTuru) {
        stokTuruList.add(stokTuru);
    }

    public void update(StokTuru stokTuru) {

    }

    public void deleteById(String uuid) {

    }

    public StokTuru getById(String uuid) {
        return null;
    }

    public List<StokTuru> findAll() {
        return stokTuruList;
    }
}
