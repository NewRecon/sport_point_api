package com.example.profileservice.service.view.Impl;


import com.example.profileservice.dto.entity.ProfileData;
import com.example.profileservice.service.entity.ProfileService;
import com.example.profileservice.service.view.ViewService;
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
