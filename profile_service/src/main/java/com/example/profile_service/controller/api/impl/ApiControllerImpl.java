package com.example.profile_service.controller.api.impl;

import com.example.profile_service.controller.api.ApiController;
import com.example.profile_service.dto.request.CreateRequest;
import com.example.profile_service.dto.request.GetByProfileIdRequest;
import com.example.profile_service.dto.request.GetByUserIdRequest;
import com.example.profile_service.dto.response.ProfileResponse;
import com.example.profile_service.service.api.ApiService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ApiControllerImpl implements ApiController {

    private final ApiService apiService;

    public ProfileResponse getByUserId(@RequestBody GetByUserIdRequest request) {
        return apiService.getByUserId(request);
    }

    public ProfileResponse getByProfileId(@RequestBody GetByProfileIdRequest request) {
        return apiService.getByProfileId(request);
    }

    public ProfileResponse create(@RequestBody CreateRequest request) {
        return apiService.createProfile(request);
    }
}
