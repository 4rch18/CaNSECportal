package com.project.cansec.controller;


import com.project.cansec.dto.response.IndicatorResponseDTO;
import com.project.cansec.model.utils.Indicator;
import com.project.cansec.service.IndicatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/indicator")
public class IndicatorController {

    @Autowired
    private IndicatorService indicatorService;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/all")
    public IndicatorResponseDTO getAllIndicators(){
        List<Indicator> indicators =  indicatorService.getAllIndicators();
        return new IndicatorResponseDTO(indicators);
    }
}
