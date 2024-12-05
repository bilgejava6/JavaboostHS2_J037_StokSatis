package com.muhammet.repository;

import com.muhammet.entity.Satis;

import java.util.ArrayList;
import java.util.List;

public class SatisRepository implements Repository<Satis>{
    private static List<Satis> satisList = new ArrayList<>();
    public void save(Satis satis) {
        satisList.add(satis);
    }

    public void update(Satis satis) {

    }

    public void deleteById(String uuid) {

    }

    public Satis getById(String uuid) {
        return null;
    }

    public List<Satis> findAll() {
        return satisList;
    }
}
