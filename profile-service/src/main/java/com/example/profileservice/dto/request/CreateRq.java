package com.example.profileservice.dto.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;

import java.util.Date;

@Builder
public record CreateRq(

        @NotNull
        String userId,

        @NotNull
        String firstName,

        @NotNull
        String email,

        String lastName,

        String phone,

        Integer age,

        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd.MM.yyyy")
        Date birthday,

        String aboutInformation,

        String sportDisciplineId
) {
}