package com.example.profile_service.service.api.impl;

import com.example.profile_service.dto.entity.ProfileData;
import com.example.profile_service.dto.request.CreateRequest;
import com.example.profile_service.dto.request.GetByProfileIdRequest;
import com.example.profile_service.dto.request.GetByUserIdRequest;
import com.example.profile_service.dto.response.ProfileResponse;
import com.example.profile_service.exception.ProfileException;
import com.example.profile_service.mapper.ResponseMapper;
import com.example.profile_service.service.api.ApiService;
import com.example.profile_service.service.entity.ProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ApiServiceImpl implements ApiService {

    private final ProfileService profileService;
    private final ResponseMapper responseMapper;

    @Override
    public ProfileResponse getByProfileId(GetByProfileIdRequest request) {

        try {
            ProfileData result = profileService.getById(request.getProfileId());
            return responseMapper.toResponse(result);
        } catch (ProfileException e) {
            throw e;
        }
    }

    @Override
    public ProfileResponse getByUserId(GetByUserIdRequest request) {

        try {
            ProfileData result = profileService.getByUserId(request.getUserId());
            return responseMapper.toResponse(result);
        } catch (ProfileException e) {
            throw e;
        }
    }

    @Override
    public ProfileResponse createProfile(CreateRequest request) {

        ProfileData profileData = ProfileData.builder()
                .profileId(UUID.randomUUID().toString())
                .userId(request.getUserId())
                .firstName(request.getFirstName())
                .email(request.getEmail())
                .lastName(request.getLastName() != null ? request.getLastName() : null)
                .phone(request.getPhone() != null ? request.getPhone() : null)
                .age(request.getAge() != null ? request.getAge() : null)
                .bDay(request.getBDay() != null ? request.getBDay() : null)
                .aboutInformation(request.getAboutInformation() != null ? request.getAboutInformation() : null)
                .sportDisciplineId(request.getSportDisciplineId() != null ? request.getSportDisciplineId() : null)
                .build();

        ProfileData profile = profileService.save(profileData);
        return responseMapper.toResponse(profile);
    }
}
