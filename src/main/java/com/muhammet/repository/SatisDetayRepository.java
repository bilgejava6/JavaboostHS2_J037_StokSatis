package com.muhammet.repository;

import com.muhammet.entity.SatisDetay;

import java.util.ArrayList;
import java.util.List;

public class SatisDetayRepository implements Repository<SatisDetay>{
    private static List<SatisDetay> satisDetayList = new ArrayList<>();
    public void save(SatisDetay satisDetay) {
        satisDetayList.add(satisDetay);
    }

    public void update(SatisDetay satisDetay) {

    }

    public void deleteById(String uuid) {

    }

    public SatisDetay getById(String uuid) {
        return null;
    }

    public List<SatisDetay> findAll() {
        return satisDetayList;
    }

    public List<SatisDetay> findAllBySatisId(String satisId){
        List<SatisDetay> resultList = new ArrayList<>();
        for (SatisDetay satisDetay : satisDetayList) {
            if(satisDetay.getSatisId().equals(satisId))
                resultList.add(satisDetay);
        }
        return resultList;
    }
}
