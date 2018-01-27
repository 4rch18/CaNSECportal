
package com.project.cansec.controller;

import com.project.cansec.dto.ScoreDTO;
import com.project.cansec.dto.request.CreateScoreRequestDTO;
import com.project.cansec.dto.request.RequestDTO;
import com.project.cansec.dto.response.RecentScoreResponseDTO;
import com.project.cansec.service.ScoreService;
import com.project.cansec.validators.CreateScoreRequestValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@SpringBootApplication
@RestController
@RequestMapping("/score")
public class ScoreController {

    @Autowired
    private ScoreService scoreService;

    @Autowired
    private CreateScoreRequestValidator createScoreRequestValidator;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    @CrossOrigin(origins = "http://localhost:4200")
    public ScoreDTO createScore(@RequestBody @Valid CreateScoreRequestDTO createScoreRequestDTO, BindingResult bindingResult){
        System.out.println("Here I am this is me");
        if(bindingResult.hasErrors()) {
            System.out.println(bindingResult.getAllErrors());
            return null;
        }
        if(createScoreRequestValidator.validateCreateScoreRequestDTO(createScoreRequestDTO))
            scoreService.createScore(createScoreRequestDTO);

        //scoreService.createScore(createScoreRequestDTO);
        //return scoreDTO;
        return null;
    }

    @PostMapping("/getRecentScoreForUser")
    public RecentScoreResponseDTO getRecentScoreForUser(@RequestBody @Valid RequestDTO requestDTO){
        return scoreService.getRecentScoreForUser(requestDTO.getUsername());
    }
}

