package com.project.cansec.service;

import com.project.cansec.dao.UserDAO;
import com.project.cansec.dto.UserDTO;
import com.project.cansec.dto.response.UserResponseDTO;
import com.project.cansec.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDAO userDAO;

    public UserResponseDTO createUser(UserDTO userDTO){
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        User user = new User(userDTO.getUsername(),userDTO.getEmail(),passwordEncoder.encode(userDTO.getPassword()));
        userDAO.save(user);
        return UserResponseDTO.build(user.getUsername(),user.getCreatedAt(),user.getEmail(),user.getScores());
    }

    public List<UserResponseDTO> displayAllUsers(){
        List<UserResponseDTO> userResponseDTOList = new ArrayList<>();
        Iterable<User> userList = userDAO.findAll();
        for(User user: userList)
            userResponseDTOList.add(UserResponseDTO.build(user.getUsername(),user.getCreatedAt(),user.getEmail(),user.getScores()));
        return userResponseDTOList;
    }

}
