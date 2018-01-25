package com.project.cansec.dto.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class IndicatorRequestDTO {

    @NotNull
    private String name;


    @NotNull
    @JsonProperty("sub_indicators")
    private List<SubIndicatorRequestDTO> subIndicatorRequestDTOList;

    public IndicatorRequestDTO(String name,  List<SubIndicatorRequestDTO> subIndicatorRequestDTOList) {
        this.name = name;
        this.subIndicatorRequestDTOList = subIndicatorRequestDTOList;
    }

    public IndicatorRequestDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public List<SubIndicatorRequestDTO> getSubIndicatorRequestDTOList() {
        return subIndicatorRequestDTOList;
    }

    public void setSubIndicatorRequestDTOList(List<SubIndicatorRequestDTO> subIndicatorRequestDTOList) {
        this.subIndicatorRequestDTOList = subIndicatorRequestDTOList;
    }

}
