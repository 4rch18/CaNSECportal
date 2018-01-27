package com.project.cansec.dao;

import com.project.cansec.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserDAO extends MongoRepository<User,String> {
    // Methods generated automatically
    List<User> findByUsername(String username);
}
