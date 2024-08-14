package com.example.profile_service.repositorie;

import com.example.profile_service.model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface ProfileRepository extends JpaRepository<Profile, UUID> {

    Optional<Profile> getByUserId(String userId);

    Optional<Profile> getByProfileId(UUID profileId);
}
