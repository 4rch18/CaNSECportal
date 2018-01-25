package com.project.cansec.service;


import com.project.cansec.dao.IndicatorDAO;
import com.project.cansec.dto.response.IndicatorResponseDTO;
import com.project.cansec.model.utils.Indicator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class IndicatorService {

    @Autowired
    private IndicatorDAO indicatorDAO;

    @PostConstruct
    public List<Indicator> getAllIndicators(){
        return indicatorDAO.findAll();
    }

}
