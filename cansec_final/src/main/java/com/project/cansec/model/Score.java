package com.project.cansec.model;




import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;
import java.util.List;

public class Score {

    private float score;

    @Field("created_at")
    private Date createdAt;

    private List<Indicator> indicators;

    public Score(float score, List<Indicator> indicators) {
        this(score,new Date(),indicators);
    }

    @PersistenceConstructor
    private Score(float score, Date createdAt, List<Indicator> indicators) {
        this.score = score;
        this.createdAt = createdAt;
        this.indicators = indicators;
    }

    public float getScore() {
        return score;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public List<Indicator> getIndicators() {
        return indicators;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public void setIndicators(List<Indicator> indicators) {
        this.indicators = indicators;
    }
}
