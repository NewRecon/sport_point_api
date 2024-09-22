package com.example.profileservice.dto.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Value;

import java.util.Date;

@Value
@Builder
@AllArgsConstructor
@NoArgsConstructor(force = true)
public class CreateRequest {

    @NotNull
    String userId;
    @NotNull
    String firstName;
    @NotNull
    String email;
    String lastName;
    String phone;
    Integer age;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd.MM.yyyy")
    Date birthday;
    String aboutInformation;
    String sportDisciplineId;
}
