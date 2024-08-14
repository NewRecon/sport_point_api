package com.example.profile_service.dto.entity;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class ProfileData {

    private String profileId;
    private String userId;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private Integer age;
    private Date bDay;
    private String aboutInformation;
    private String sportDisciplineId;
}