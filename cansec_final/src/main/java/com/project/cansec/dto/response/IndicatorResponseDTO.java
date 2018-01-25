package com.project.cansec.dto.response;

import com.project.cansec.model.utils.Indicator;

import java.util.List;

public class IndicatorResponseDTO {
    private List<Indicator> indicators;

    public IndicatorResponseDTO(List<Indicator> indicators) {
        this.indicators = indicators;
    }

    public IndicatorResponseDTO() {
    }

    public List<Indicator> getIndicators() {
        return indicators;
    }

    public void setIndicators(List<Indicator> indicators) {
        this.indicators = indicators;
    }
}

