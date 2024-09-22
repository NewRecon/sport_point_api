package com.example.profileservice.service.view;

import com.example.profileservice.dto.entity.ProfileData;

public interface ViewService {

    ProfileData getProfileViewByUserId(String UserId);
}
