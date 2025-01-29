package com.example.profileservice.service.api.impl;

import com.example.profileservice.dto.entity.ProfileData;
import com.example.profileservice.dto.request.CreateRq;
import com.example.profileservice.dto.response.ProfileRs;
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
    public ProfileRs getByProfileId(String id) throws ProfileException {

        ProfileData result = profileService.getById(id);
        return responseMapper.toResponse(result);
    }

    @Override
    public ProfileRs getByUserId(String id) throws ProfileException {

        ProfileData result = profileService.getByUserId(id);
        return responseMapper.toResponse(result);
    }

    @Override
    public ProfileRs createProfile(CreateRq request) {

        ProfileData profileData = ProfileData.builder()
                .profileId(UUID.randomUUID().toString())
                .userId(request.userId())
                .firstName(request.firstName())
                .email(request.email())
                .lastName(request.lastName())
                .phone(request.phone())
                .age(request.age())
                .birthday(request.birthday())
                .aboutInformation(request.aboutInformation())
                .sportDisciplineId(request.sportDisciplineId())
                .build();

        ProfileData profile = profileService.save(profileData);
        return responseMapper.toResponse(profile);
    }
}
