package com.kocsisrobert.cal.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class UserRegistrationData {

    @Size(min = 3, max = 15)
    private String username;

    @Size(min = 3, max = 255)
    private String password;
}
