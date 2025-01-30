package com.example.profileservice.service.entity;

import com.example.profileservice.dto.entity.ProfileDto;

public interface ProfileService {

    ProfileDto getById(String profileId);

    ProfileDto save(ProfileDto profileDto);

    void delete(String profileId);
}
