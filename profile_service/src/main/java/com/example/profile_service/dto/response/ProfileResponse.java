package com.example.profile_service.dto.response;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class ProfileResponse {

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
