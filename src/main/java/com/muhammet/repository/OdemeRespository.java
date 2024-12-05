package com.muhammet.repository;

import com.muhammet.entity.Odeme;

import java.util.ArrayList;
import java.util.List;

public class OdemeRespository implements Repository<Odeme>{
    private static List<Odeme> odemeList = new ArrayList<>();
    public void save(Odeme odeme) {
        odemeList.add(odeme);
    }

    public void update(Odeme odeme) {

    }

    public void deleteById(String uuid) {

    }

    public Odeme getById(String uuid) {
        return null;
    }

    public List<Odeme> findAll() {
        return odemeList;
    }
}
