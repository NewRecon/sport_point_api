package com.example.profileservice.mapper;

import com.example.profileservice.dto.entity.ProfileData;
import com.example.profileservice.dto.response.ProfileResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ResponseMapper {

    ProfileResponse toResponse(ProfileData profileData);
}
