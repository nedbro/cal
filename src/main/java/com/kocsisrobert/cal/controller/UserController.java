package com.kocsisrobert.cal.controller;

import com.kocsisrobert.cal.dto.UserRegistrationData;
import lombok.extern.java.Log;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/user")
@Log
public class UserController {

    public UserController() {
    }

    @PostMapping
    public ResponseEntity createUser(@Valid UserRegistrationData userRegistrationData){
        log.info("/api/user accessed");
        return new ResponseEntity(HttpStatus.OK);
    }
}