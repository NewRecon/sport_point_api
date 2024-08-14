package com.example.profile_service.mapper;

import com.example.profile_service.dto.entity.ProfileData;
import com.example.profile_service.dto.response.ProfileResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ResponseMapper {

    ProfileResponse toResponse(ProfileData profileData);
}
