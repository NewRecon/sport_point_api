package com.example.profileservice.service.api;

import com.example.profileservice.dto.request.CreateRq;
import com.example.profileservice.dto.request.UpdateRq;
import com.example.profileservice.dto.response.ProfileRs;

public interface ApiService {

    ProfileRs getByProfileId(String id);

    ProfileRs create(CreateRq request);

    ProfileRs update(UpdateRq request);

    void delete(String id);
}
