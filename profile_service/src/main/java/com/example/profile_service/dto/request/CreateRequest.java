package com.example.profile_service.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

import java.util.Date;

@Value
@Builder
@AllArgsConstructor
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
    Date bDay;
    String aboutInformation;
    String sportDisciplineId;
}
