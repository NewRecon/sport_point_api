package com.example.profileservice.controller.impl;

import com.example.profileservice.controller.ApiController;
import com.example.profileservice.dto.request.CreateRq;
import com.example.profileservice.dto.response.ProfileRs;
import com.example.profileservice.service.api.ApiService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ApiControllerImpl implements ApiController {

    private final ApiService apiService;

    @Override
    public ProfileRs getByUserId(String id) {
        return apiService.getByUserId(id);
    }

    @Override
    public ProfileRs getByProfileId(String id) {
        return apiService.getByProfileId(id);
    }

    @Override
    public ProfileRs create(CreateRq request) {
        return apiService.createProfile(request);
    }
}
