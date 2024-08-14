package com.example.profile_service.service.view;

import com.example.profile_service.dto.entity.ProfileData;

public interface ViewService {

    ProfileData getProfileViewByUserId(String UserId);
}
