package com.example.profile_service.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Entity
@Data
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
    private Date birthday;
    private String aboutInformation;
    private String sportDisciplineId;
}
