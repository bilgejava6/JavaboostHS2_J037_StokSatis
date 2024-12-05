package com.muhammet.repository;

import com.muhammet.entity.Borc;

import java.util.ArrayList;
import java.util.List;

public class BorcRepository implements Repository<Borc>{
    private static List<Borc> borcList = new ArrayList<>();

    public void save(Borc borc) {
        borcList.add(borc);
    }

    public void update(Borc borc) {

    }

    public void deleteById(String uuid) {

    }

    public Borc getById(String uuid) {
        return null;
    }

    public List<Borc> findAll() {
        return borcList;
    }
}
