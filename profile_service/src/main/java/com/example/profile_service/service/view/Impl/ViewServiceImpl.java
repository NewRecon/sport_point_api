package com.example.profile_service.service.view.Impl;


import com.example.profile_service.dto.entity.ProfileData;
import com.example.profile_service.service.entity.ProfileService;
import com.example.profile_service.service.view.ViewService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ViewServiceImpl implements ViewService {

    private final ProfileService profileService;

    @Override
    public ProfileData getProfileViewByUserId(String userId) {
        return profileService.getByUserId(userId);
    }
}
