package com.example.profileservice.mapper;

import com.example.profileservice.dto.entity.ProfileDto;
import com.example.profileservice.model.Profile;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.util.UUID;

@Mapper(componentModel = "spring")
public interface EntityMapper {

    @Mapping(target = "profileId",
            source = "profileDto.profileId",
            qualifiedByName = "StringToUUID",
            dateFormat = "yyyy-MM-dd")
    Profile toEntity(ProfileDto profileDto);

    @Mapping(target = "profileId",
            source = "profile.profileId",
            qualifiedByName = "UUIDToString",
            dateFormat = "yyyy-MM-dd")
    ProfileDto toDto(Profile profile);

    @Named("StringToUUID")
    default UUID StringToUUID(String value) {
        return UUID.fromString(value);
    }

    @Named("UUIDToString")
    default String UUIDToString(UUID value) {
        return value.toString();
    }
}
