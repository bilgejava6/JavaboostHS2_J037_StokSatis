package com.muhammet.repository;

import com.muhammet.entity.Marka;

import java.util.ArrayList;
import java.util.List;

public class MarkaRepository implements Repository<Marka>{
    private static List<Marka> markaList = new ArrayList();
    public void save(Marka marka) {
        markaList.add(marka);
    }

    public void update(Marka marka) {

    }

    public void deleteById(String uuid) {

    }

    public Marka getById(String uuid) {
        return null;
    }

    public List<Marka> findAll() {
        return markaList;
    }
}
