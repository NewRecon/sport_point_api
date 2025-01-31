package com.example.profileservice.dto.entity;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder(toBuilder = true)
public class  ProfileDto {

    private String profileId;

    private String firstName;

    private String lastName;

    private String email;

    private Date birthday;

    private String aboutInformation;
}
