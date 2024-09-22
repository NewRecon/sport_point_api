package com.example.profileservice.repositorie;

import com.example.profileservice.model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface ProfileRepository extends JpaRepository<Profile, UUID> {

    Optional<Profile> getByUserId(String userId);

    Optional<Profile> getByProfileId(UUID profileId);
}
