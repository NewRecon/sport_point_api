package com.example.profileservice.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
import java.util.Objects;
import java.util.UUID;

@Table(name = "profiles")
@Entity
@Setter
@Getter
@Builder
@ToString
public class Profile {

    @Id
    @Column(nullable = false, updatable = false, name = "id", columnDefinition = "uuid")
    private UUID profileId;
    private String firstName;
    private String lastName;
    private String email;
    private Date birthday;
    private String aboutInformation;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Profile profile = (Profile) o;
        return Objects.equals(profileId, profile.profileId);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(profileId);
    }
}
