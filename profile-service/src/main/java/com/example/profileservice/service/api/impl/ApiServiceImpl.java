package com.example.profileservice.service.api.impl;

import com.example.profileservice.dto.entity.ProfileData;
import com.example.profileservice.dto.request.CreateRequest;
import com.example.profileservice.dto.request.GetByProfileIdRequest;
import com.example.profileservice.dto.request.GetByUserIdRequest;
import com.example.profileservice.dto.response.ProfileResponse;
import com.example.profileservice.exception.ProfileException;
import com.example.profileservice.mapper.ResponseMapper;
import com.example.profileservice.service.api.ApiService;
import com.example.profileservice.service.entity.ProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ApiServiceImpl implements ApiService {

    private final ProfileService profileService;
    private final ResponseMapper responseMapper;

    @Override
    public ProfileResponse getByProfileId(GetByProfileIdRequest request) throws ProfileException {

        ProfileData result = profileService.getById(request.getProfileId());
        return responseMapper.toResponse(result);
    }

    @Override
    public ProfileResponse getByUserId(GetByUserIdRequest request) throws ProfileException {

        ProfileData result = profileService.getByUserId(request.getUserId());
        return responseMapper.toResponse(result);
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
                .birthday(request.getBirthday() != null ? request.getBirthday() : null)
                .aboutInformation(request.getAboutInformation() != null ? request.getAboutInformation() : null)
                .sportDisciplineId(request.getSportDisciplineId() != null ? request.getSportDisciplineId() : null)
                .build();

        ProfileData profile = profileService.save(profileData);
        return responseMapper.toResponse(profile);
    }
}
