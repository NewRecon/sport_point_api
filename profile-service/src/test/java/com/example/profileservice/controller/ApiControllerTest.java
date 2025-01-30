package com.example.profileservice.controller;

import com.example.profileservice.ProfileServiceApplication;
import com.example.profileservice.dto.request.CreateRq;
import com.example.profileservice.repositorie.ProfileRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ApiControllerTest extends ProfileServiceApplication {

    @Autowired
    private ProfileRepository profileRepository;

    @Autowired
    private ApiController apiController;

    @Test
    void createProfileTest() {


    }

    private CreateRq getCreateRq() {
        return CreateRq.builder().build();
    }
}
