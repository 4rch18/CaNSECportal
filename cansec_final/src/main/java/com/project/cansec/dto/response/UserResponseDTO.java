package com.project.cansec.dto.response;

import com.project.cansec.model.Score;


import java.util.Date;
import java.util.List;

public class UserResponseDTO {

    private String username;

    private Date createdAt;

    private String email;

    private List<Score> scores;

    public String getUsername() {
        return username;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public String getEmail() {
        return email;
    }

    public List<Score> getScore() {
        return scores;
    }

    public static UserResponseDTO build(String username, Date createdAt, String email, List<Score> scores){
        UserResponseDTO userResponseDTO = new UserResponseDTO();
        userResponseDTO.username = username;
        userResponseDTO.createdAt = createdAt;
        userResponseDTO.email = email;
        userResponseDTO.scores = scores;
        return userResponseDTO;
    }
}
