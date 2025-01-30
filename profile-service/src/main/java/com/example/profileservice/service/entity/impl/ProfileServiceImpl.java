package com.example.profileservice.service.entity.impl;

import com.example.profileservice.dto.entity.ProfileDto;
import com.example.profileservice.exception.ErrorType;
import com.example.profileservice.exception.ProfileException;
import com.example.profileservice.mapper.EntityMapper;
import com.example.profileservice.repositorie.ProfileRepository;
import com.example.profileservice.service.entity.ProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ProfileServiceImpl implements ProfileService {

    private final ProfileRepository profileRepository;
    private final EntityMapper entityMapper;

    @Override
    public ProfileDto getById(String profileId) {
        return entityMapper.toDto(profileRepository.findById(UUID.fromString(profileId))
                .orElseThrow(() -> new ProfileException(ErrorType.PROFILE_NOT_FOUND)));
    }

    @Override
    public ProfileDto save(ProfileDto profileDto) {
        return entityMapper.toDto(entityMapper.toEntity(profileDto));
    }

    @Override
    public void delete(String profileId) {
        profileRepository.deleteById(UUID.fromString(profileId));
    }
}
