package com.project.cansec.dto.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateScoreRequestDTO extends RequestDTO {

    @JsonProperty("indicators")
    private List<IndicatorRequestDTO> indicatorRequestDTOList;

    public CreateScoreRequestDTO(String username, List<IndicatorRequestDTO> indicatorRequestDTOList) {
        super(username);
        this.indicatorRequestDTOList = indicatorRequestDTOList;
    }

    public CreateScoreRequestDTO() {
    }

    public List<IndicatorRequestDTO> getIndicatorRequestDTOList() {
        return indicatorRequestDTOList;
    }

    public void setIndicatorRequestDTOList(List<IndicatorRequestDTO> indicatorRequestDTOList) {
        this.indicatorRequestDTOList = indicatorRequestDTOList;
    }

    public IndicatorRequestDTO contains(String name){
        if(this.indicatorRequestDTOList!=null && this.indicatorRequestDTOList.size()>0)
            for(IndicatorRequestDTO indicatorRequestDTO : indicatorRequestDTOList)
                if(name==indicatorRequestDTO.getName())
                    return indicatorRequestDTO;
        return null;
    }
}
