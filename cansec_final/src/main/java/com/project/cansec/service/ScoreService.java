
package com.project.cansec.service;


import com.project.cansec.dao.IndicatorDAO;
import com.project.cansec.dao.UserDAO;
import com.project.cansec.dto.ScoreDTO;
import com.project.cansec.dto.request.CreateScoreRequestDTO;
import com.project.cansec.dto.request.IndicatorRequestDTO;
import com.project.cansec.dto.response.RecentScoreResponseDTO;
import com.project.cansec.model.Score;
import com.project.cansec.model.User;
import com.project.cansec.model.utils.Indicator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ScoreService {


    @Autowired
    private UserDAO userDAO;

    @Autowired
    private IndicatorDAO indicatorDAO;

    public boolean createScore(CreateScoreRequestDTO createScoreRequestDTO){
        User user = userDAO.findByUsername(createScoreRequestDTO.getUsername()).get(0);
        List<Score> scores = user.getScores();

        List<Indicator> indicators = indicatorDAO.findAll();


        List<com.project.cansec.model.Indicator> scoreIndicator = new ArrayList<>();
        //List<Indicator> indicators = new ArrayList<>();

        for(Indicator indicator:indicators) {
            IndicatorRequestDTO indicatorRequestDTO = createScoreRequestDTO.contains(indicator.getName());
            if(indicatorRequestDTO == null)
                return false;
        }
        //indicators.add(new GreenBuildingCertificationOrAccreditationIndicator(scoreDTO.getScore(),0));
        /*Score score = new Score(0,indicators);
        scores.add(score);
        user.setScores(scores);
        userDAO.save(user)*/;
        return true;
    }

    public RecentScoreResponseDTO getRecentScoreForUser(String username){
        User user = userDAO.findByUsername(username).get(0);
        List<Score> scores = user.getScores();
        if(scores.size() > 1)
            return new RecentScoreResponseDTO(scores.get(0));
        else
            return null;
    }

}

