package com.example.profileservice.service.api.impl;

import com.example.profileservice.dto.entity.ProfileDto;
import com.example.profileservice.dto.request.CreateRq;
import com.example.profileservice.dto.request.UpdateRq;
import com.example.profileservice.dto.response.ProfileRs;
import com.example.profileservice.exception.ProfileException;
import com.example.profileservice.mapper.RequestMapper;
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
    private final RequestMapper requestMapper;

    @Override
    public ProfileRs getByProfileId(String id) throws ProfileException {
        return responseMapper.toResponse(profileService.getById(id));
    }

    @Override
    public ProfileRs create(CreateRq request) {

        ProfileDto profileDto = requestMapper.toDto(request);
        profileDto = profileDto.toBuilder().profileId(UUID.randomUUID().toString()).build();

        return responseMapper.toResponse(profileService.save(profileDto));
    }

    @Override
    public ProfileRs update(UpdateRq request) {
        return responseMapper.toResponse(profileService.save(requestMapper.toDto(request)));
    }

    @Override
    public void delete(String id) {
        profileService.delete(id);
    }
}
