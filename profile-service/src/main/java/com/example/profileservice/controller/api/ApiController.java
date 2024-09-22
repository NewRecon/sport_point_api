package com.example.profileservice.controller.api;

import com.example.profileservice.dto.request.CreateRequest;
import com.example.profileservice.dto.request.GetByProfileIdRequest;
import com.example.profileservice.dto.request.GetByUserIdRequest;
import com.example.profileservice.dto.response.ProfileResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/v1/profiles")
public interface ApiController {

    @PostMapping("/getByUserId")
    ProfileResponse getByUserId(GetByUserIdRequest request);

    @PostMapping("/getByProfileId")
    ProfileResponse getByProfileId(GetByProfileIdRequest request);

    @PostMapping("/create")
    ProfileResponse create(CreateRequest request);
}
