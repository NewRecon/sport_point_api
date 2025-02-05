package com.example.profileservice.dto.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;

import java.util.Date;

@Builder(toBuilder = true)
public record CreateRq(

        @NotNull
        String firstName,

        String lastName,

        @NotNull
        String email,

        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd.MM.yyyy")
        Date birthday,

        String aboutInformation
) {
}