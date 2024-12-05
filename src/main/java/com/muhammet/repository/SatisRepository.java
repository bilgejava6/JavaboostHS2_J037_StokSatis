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

    /**
     * İd si verilen müşteri ye yapılan satış ya da satışların listesini getir.
     * @param musteriId
     * @return
     */
    public List<Satis> findAllByMusteriId(String musteriId) {
        List<Satis> resultList = new ArrayList<>(); // boş bir liste oluştur
        for (Satis satis: satisList){ // tüm satışları dön
            if(satis.getMusteriId().equals(musteriId)) // bu satış id si verilen müşteriye mi yapılmış?
                resultList.add(satis); // evet ise listenin içine bu satışı ekle
        }
        return resultList; // bulduğun katırları içeren listeyi dön.

       // return satisList.stream().filter(x-> x.getMusteriId().equals(musteriId)).toList();
    }
}
