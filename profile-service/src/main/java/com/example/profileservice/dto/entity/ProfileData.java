package com.example.profileservice.dto.entity;

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

    private Date birthday;

    private String aboutInformation;

    private String sportDisciplineId;
}
