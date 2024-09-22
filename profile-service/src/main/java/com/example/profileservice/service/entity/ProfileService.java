package com.example.profileservice.service.entity;

import com.example.profileservice.dto.entity.ProfileData;

public interface ProfileService {

    ProfileData save(ProfileData profileData);

    ProfileData getById(String profileId);

    ProfileData getByUserId(String userId);
}
