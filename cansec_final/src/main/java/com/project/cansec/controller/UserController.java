package com.project.cansec.controller;

import com.project.cansec.dto.UserDTO;
import com.project.cansec.dto.response.UserResponseDTO;
import com.project.cansec.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;



@SpringBootApplication
@RestController
@RequestMapping("/user")
public class UserController {

    //private static final Logger logger = LogManager.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public UserResponseDTO createUser(@RequestBody @Valid UserDTO userDTO, BindingResult bindingResult){
        if(bindingResult.hasErrors()) {
            return null;
        }
        return userService.createUser(userDTO);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/display")
    public List<UserResponseDTO> displayUser(){
        return userService.displayAllUsers();
    }

    /*@RequestMapping("/resource")
    public Map<String,Object> home() {
        Map<String,Object> model = new HashMap<String,Object>();
        model.put("id", UUID.randomUUID().toString());
        model.put("content", "Hello World");
        return model;
    }*/

}
