package com.example.profile_service.service.entity.impl;

import com.example.profile_service.dto.entity.ProfileData;
import com.example.profile_service.exception.ErrorType;
import com.example.profile_service.exception.ProfileException;
import com.example.profile_service.mapper.ProfileMapper;
import com.example.profile_service.model.Profile;
import com.example.profile_service.repositorie.ProfileRepository;
import com.example.profile_service.service.entity.ProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ProfileServiceImpl implements ProfileService {

    private final ProfileRepository profileRepository;
    private final ProfileMapper profileMapper;

    @Override
    public ProfileData save(ProfileData profileData) {

        Profile profile = profileMapper.toModel(profileData);

        return profileMapper.toData(profileRepository.save(profile));
    }

    @Override
    public ProfileData getById(String profileId) {

        Optional<Profile> profile = profileRepository.getByProfileId(UUID.fromString(profileId));

        if (profile.isPresent()) {
            return profileMapper.toData(profile.get());
        } else {
            throw new ProfileException(ErrorType.PROFILE_NOT_FOUND);
        }
    }

    @Override
    public ProfileData getByUserId(String userId) {

        Optional<Profile> profile = profileRepository.getByUserId(userId);

        if (profile.isPresent()) {
            return profileMapper.toData(profile.get());
        } else {
            throw new ProfileException(ErrorType.PROFILE_NOT_FOUND);
        }
    }
}
