package com.example.profile_service.controller.api.impl;

import com.example.profile_service.dto.request.CreateRequest;
import com.example.profile_service.dto.request.GetByProfileIdRequest;
import com.example.profile_service.dto.request.GetByUserIdRequest;
import com.example.profile_service.dto.response.ProfileResponse;
import com.example.profile_service.service.api.ApiService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/profiles")
@RequiredArgsConstructor
public class ApiControllerImpl {

    private final ApiService apiService;

    @PostMapping("/getByUserId")
    public ProfileResponse getByUserId(@RequestBody GetByUserIdRequest request) {
        return apiService.getByUserId(request);
    }

    @PostMapping("/getByProfileId")
    public ProfileResponse getByProfileId(@RequestBody GetByProfileIdRequest request) {
        return apiService.getByProfileId(request);
    }

    @PostMapping("/create")
    public ProfileResponse create(@RequestBody CreateRequest request) {
        return apiService.createProfile(request);
    }
}
