package com.example.profile_service.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
import java.util.Objects;
import java.util.UUID;

@Entity
@Setter
@Getter
@ToString
@Table(name = "profiles")
public class Profile {

    @Id
    @Column(nullable = false, updatable = false, name = "id", columnDefinition = "uuid")
    private UUID profileId;
    private String userId;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private Integer age;
    private Date bDay;
    private String aboutInformation;
    private String sportDisciplineId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Profile profile = (Profile) o;
        return Objects.equals(profileId, profile.profileId) && Objects.equals(userId, profile.userId) && Objects.equals(email, profile.email) && Objects.equals(phone, profile.phone) && Objects.equals(age, profile.age) && Objects.equals(bDay, profile.bDay) && Objects.equals(aboutInformation, profile.aboutInformation) && Objects.equals(sportDisciplineId, profile.sportDisciplineId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(profileId, userId, email, phone, age, bDay, aboutInformation, sportDisciplineId);
    }
}
