package com.project.cansec.dao;

import com.project.cansec.model.utils.Indicator;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IndicatorDAO extends MongoRepository<Indicator,Long> {
}
