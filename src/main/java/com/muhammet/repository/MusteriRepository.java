package com.muhammet.repository;

import com.muhammet.entity.Musteri;

import java.util.ArrayList;
import java.util.List;

public class MusteriRepository implements Repository<Musteri>{
    private static List<Musteri> musteriList = new ArrayList();

    public void save(Musteri musteri) {
        musteriList.add(musteri);
    }

    public void update(Musteri musteri) {

    }

    public void deleteById(String uuid) {

    }

    public Musteri getById(String uuid) {
        return null;
    }

    public List<Musteri> findAll() {
        return musteriList;
    }
}
