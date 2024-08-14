package com.example.profile_service.controller.api;

import com.example.profile_service.dto.request.CreateRequest;
import com.example.profile_service.dto.request.GetByProfileIdRequest;
import com.example.profile_service.dto.request.GetByUserIdRequest;
import com.example.profile_service.dto.response.ProfileResponse;

public interface ApiController {

    ProfileResponse getByUserId(GetByUserIdRequest request);

    ProfileResponse getByProfileId(GetByProfileIdRequest request);

    ProfileResponse create(CreateRequest request);
}
