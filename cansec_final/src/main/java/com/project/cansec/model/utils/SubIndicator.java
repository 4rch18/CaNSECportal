package com.project.cansec.model.utils;

import org.springframework.data.annotation.PersistenceConstructor;

public class SubIndicator {

    private String name;

    private float weight;

    private String description;

    @PersistenceConstructor
    public SubIndicator(String name, float weight, String description) {
        this.name = name;
        this.weight = weight;
        this.description = description;
    }

    public SubIndicator() {
    }

    public String getName() {
        return name;
    }

    public float getWeight() {
        return weight;
    }

    public String getDescription() {
        return description;
    }
}
