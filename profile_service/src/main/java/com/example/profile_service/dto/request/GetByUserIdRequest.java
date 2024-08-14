package com.example.profile_service.dto.request;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class GetByUserIdRequest {

    String userId;
}
