package com.muhammet.repository;

import com.muhammet.entity.BaseEntity;

import java.util.List;

// Generic Class - Interface

/**
 * Eğer T nin sadece belli bir türden varlıkları
 * kabul etmesini istiyorsanız o zaman T nin
 * miras aldığı ya da türediği sınıfa genişletin.
 * @param <T>
 */
public interface Repository<T extends BaseEntity>{
    void save(T t);
    void update(T t);
    void deleteById(String uuid);
    T getById(String uuid);
    List<T> findAll();
}
