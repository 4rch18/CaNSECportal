package com.project.cansec.model;




import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Document(collection = "users")
public class User {

    @Id
    private String id;

    @Indexed(unique = true)
    private String username;

    private String email;

    private String password;

    private List<Score> scores;

    private boolean enabled;

    @Field("created_at")
    private Date createdAt;


    public User(String username, String email, String password) {
        this(username, email, password,new ArrayList<>(),true,new Date());
    }



    @PersistenceConstructor
    private User(String username, String email, String password, List<Score> scores,boolean enabled, Date createdAt) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.scores = scores;
        this.enabled = enabled;
        this.createdAt = createdAt;
    }

    public User() {
    }

    public String getId() {
        return id;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public List<Score> getScores() {
        return scores;
    }

    public void setScores(List<Score> scores) {
        this.scores = scores;
    }

    @Override
    public String toString(){
        return "username = "+username+
                " password = "+password+
                " email = "+email+
                " enabled = "+enabled+
                " createAt = "+createdAt;
    }
}
