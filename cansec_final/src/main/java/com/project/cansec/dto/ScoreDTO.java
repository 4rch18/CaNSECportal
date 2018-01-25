package com.project.cansec.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.validation.constraints.NotNull;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ScoreDTO {

    @NotNull
    private String username;

    @NotNull
    private String subIndicator;

    @NotNull
    private float score;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSubIndicator() {
        return subIndicator;
    }

    public void setSubIndicator(String subIndicator) {
        this.subIndicator = subIndicator;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public static ScoreDTO build(String username,String subIndicator,float score){
        ScoreDTO scoreDTO = new ScoreDTO();
        scoreDTO.username = username;
        scoreDTO.subIndicator = subIndicator;
        scoreDTO.score = score;
        return scoreDTO;
    }
}
