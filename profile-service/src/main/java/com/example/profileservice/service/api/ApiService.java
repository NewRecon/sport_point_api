package com.example.profileservice.service.api;

import com.example.profileservice.dto.request.CreateRequest;
import com.example.profileservice.dto.request.GetByProfileIdRequest;
import com.example.profileservice.dto.request.GetByUserIdRequest;
import com.example.profileservice.dto.response.ProfileResponse;

public interface ApiService {

    ProfileResponse getByProfileId(GetByProfileIdRequest request);

    ProfileResponse getByUserId(GetByUserIdRequest request);

    ProfileResponse createProfile(CreateRequest request);
}
