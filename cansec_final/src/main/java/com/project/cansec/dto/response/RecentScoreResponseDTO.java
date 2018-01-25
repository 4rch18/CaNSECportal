package com.project.cansec.dto.response;

import com.project.cansec.model.Score;

public class RecentScoreResponseDTO {

    private Score score;

    public RecentScoreResponseDTO(Score score) {
        this.score = score;
    }

    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
    }
}
