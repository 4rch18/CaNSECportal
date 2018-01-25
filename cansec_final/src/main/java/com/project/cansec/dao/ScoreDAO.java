/*
package com.project.cansec.dao;

import com.project.cansec.model.Score;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ScoreDAO extends CrudRepository<Score,Long> {

    @Query(value = "select * from score where user_username = :username and created_at = (select created_at from score order by created_at desc limit 1)",nativeQuery = true)
    List<Score> findByUser(@Param("username") String username);
}
*/
