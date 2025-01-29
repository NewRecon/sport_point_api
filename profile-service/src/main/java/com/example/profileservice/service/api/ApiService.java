package com.example.profileservice.service.api;

import com.example.profileservice.dto.request.CreateRq;
import com.example.profileservice.dto.response.ProfileRs;

public interface ApiService {

    ProfileRs getByProfileId(String id);

    ProfileRs getByUserId(String id);

    ProfileRs createProfile(CreateRq request);
}
