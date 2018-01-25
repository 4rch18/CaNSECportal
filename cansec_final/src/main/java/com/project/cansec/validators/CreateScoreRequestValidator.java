package com.project.cansec.validators;

import com.project.cansec.dto.request.CreateScoreRequestDTO;
import com.project.cansec.model.utils.Indicator;
import com.project.cansec.service.IndicatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Hashtable;
import java.util.List;

@Service
public class CreateScoreRequestValidator {

    @Autowired
    private IndicatorService indicatorService;

    public boolean validateCreateScoreRequestDTO(CreateScoreRequestDTO createScoreRequestDTO){

        List<Indicator> indicators = indicatorService.getAllIndicators();
        return false;

        Hashtable

        // match indicator, sub-indicator names

        // switch - case validation
    }
}
