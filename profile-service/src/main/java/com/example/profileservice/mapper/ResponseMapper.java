package com.example.profileservice.mapper;

import com.example.profileservice.dto.entity.ProfileDto;
import com.example.profileservice.dto.response.ProfileRs;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ResponseMapper {

    ProfileRs toResponse(ProfileDto profileDto);
}
