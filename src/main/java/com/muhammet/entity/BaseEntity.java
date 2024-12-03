package com.muhammet.entity;

import java.util.UUID;

public abstract class BaseEntity {
    private String uuid;
    private Long createdAt;
    private Long updatedAt;
    public BaseEntity(){
        uuid = UUID.randomUUID().toString();
        createdAt = System.currentTimeMillis();
        updatedAt = createdAt;
    }

    public String getUuid() {
        return uuid;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public Long getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
    }
}
