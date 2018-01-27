package com.project.cansec.model.utils;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document(collection = "indicator")
public class Indicator {

    @Id
    private String id;

    private String name;

    private float weight;

    private String description;

    @Field(value = "sub_indicators")
    @JsonProperty(value = "sub_indicators")
    private List<SubIndicator> subIndicators;

    @PersistenceConstructor
    public Indicator(String name, float weight, String description, List<SubIndicator> subIndicators) {
        this.name = name;
        this.weight = weight;
        this.description = description;
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

    public List<SubIndicator> getSubIndicators() {
        return subIndicators;
    }




}
