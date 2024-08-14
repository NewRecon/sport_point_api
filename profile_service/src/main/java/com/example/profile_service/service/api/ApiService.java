package com.example.profile_service.service.api;

import com.example.profile_service.dto.request.CreateRequest;
import com.example.profile_service.dto.request.GetByProfileIdRequest;
import com.example.profile_service.dto.request.GetByUserIdRequest;
import com.example.profile_service.dto.response.ProfileResponse;

public interface ApiService {

    ProfileResponse getByProfileId(GetByProfileIdRequest request);

    ProfileResponse getByUserId(GetByUserIdRequest request);

    ProfileResponse createProfile(CreateRequest request);
}
