package com.example.profile_service.mapper;

import com.example.profile_service.dto.entity.ProfileData;
import com.example.profile_service.model.Profile;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.util.UUID;

@Mapper(componentModel = "spring")
public interface ProfileMapper {

    @Mapping(target = "profileId", source = "profileData.profileId", qualifiedByName = "StringToUUID", dateFormat = "yyyy-MM-dd")
    Profile toModel(ProfileData profileData);

    @Mapping(target = "profileId", source = "profile.profileId", qualifiedByName = "UUIDToString", dateFormat = "yyyy-MM-dd")
    ProfileData toData(Profile profile);

    @Named("StringToUUID")
    default UUID StringToUUID(String value) {
        return UUID.fromString(value);
    }

    @Named("UUIDToString")
    default String UUIDToString(UUID value) {
        return value.toString();
    }
}
