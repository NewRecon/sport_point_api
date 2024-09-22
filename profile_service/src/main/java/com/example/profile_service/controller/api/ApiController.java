package com.example.profile_service.controller.api;

import com.example.profile_service.dto.request.CreateRequest;
import com.example.profile_service.dto.request.GetByProfileIdRequest;
import com.example.profile_service.dto.request.GetByUserIdRequest;
import com.example.profile_service.dto.response.ProfileResponse;
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
