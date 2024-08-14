package com.example.profile_service.service.entity;

import com.example.profile_service.dto.entity.ProfileData;

public interface ProfileService {

    ProfileData save(ProfileData profileData);

    ProfileData getById(String profileId);

    ProfileData getByUserId(String userId);
}
