package com.project.cansec.model;


import org.springframework.data.annotation.PersistenceConstructor;

public class SubIndicator {

    private String name;

    private float weight;

    private String description;

    private float score;

    @PersistenceConstructor
    public SubIndicator(String name, float weight, String description, float score) {
        this.name = name;
        this.weight = weight;
        this.description = description;
        this.score = score;
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

    public float getScore() {
        return score;
    }
}
