package com.muhammet.repository;

import com.muhammet.entity.Model;

import java.util.ArrayList;
import java.util.List;

public class ModelRepository implements Repository<Model>{
    private static List<Model> modelList = new ArrayList<>();
    public void save(Model model) {
        modelList.add(model);
    }

    public void update(Model model) {

    }

    public void deleteById(String uuid) {

    }

    public Model getById(String uuid) {
        return null;
    }

    public List<Model> findAll() {
        return modelList;
    }
}
