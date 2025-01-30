package com.example.profileservice.dto.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class ProfileRs {

    private String profileId;

    private String firstName;

    private String lastName;

    private String email;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd.MM.yyyy")
    private Date birthday;

    private String aboutInformation;
}
