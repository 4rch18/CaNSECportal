package com.project.cansec.model;

import org.springframework.data.annotation.PersistenceConstructor;

import java.util.ArrayList;
import java.util.List;

public class Indicator {

    private String name;

    private float weight;

    private String description;

    private float score;

    private List<SubIndicator> subIndicators;

    public Indicator(String name, float weight, String description) {
        this(name,weight,description,0,new ArrayList<>());
    }

    @PersistenceConstructor
    public Indicator(String name, float weight, String description, float score, List<SubIndicator> subIndicators) {
        this.name = name;
        this.weight = weight;
        this.description = description;
        this.score = score;
        this.subIndicators = subIndicators;
    }

    public Indicator() {
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

    public List<SubIndicator> getSubIndicators() {
        return subIndicators;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public void setSubIndicators(List<SubIndicator> subIndicators) {
        this.subIndicators = subIndicators;
    }
}
