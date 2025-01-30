package com.example.profileservice.dto.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotNull;

import java.util.Date;

public record UpdateRq(

        @NotNull
        String profileId,

        String firstName,

        String lastName,

        String email,

        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd.MM.yyyy")
        Date birthday,

        String aboutInformation
) {

}
