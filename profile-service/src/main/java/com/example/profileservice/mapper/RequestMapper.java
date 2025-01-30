package com.example.profileservice.mapper;

import com.example.profileservice.dto.entity.ProfileDto;
import com.example.profileservice.dto.request.CreateRq;
import com.example.profileservice.dto.request.UpdateRq;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RequestMapper {

    ProfileDto toDto(CreateRq request);

    ProfileDto toDto(UpdateRq request);
}
