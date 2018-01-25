package com.project.cansec.dto.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.validation.constraints.NotNull;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SubIndicatorRequestDTO {

    @NotNull
    private String name;

    @NotNull
    private float value;

    public SubIndicatorRequestDTO(String name, float value) {
        this.name = name;
        this.value = value;
    }

    public SubIndicatorRequestDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }
}
