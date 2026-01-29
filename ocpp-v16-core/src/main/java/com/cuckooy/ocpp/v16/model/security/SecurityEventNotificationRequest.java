package com.cuckooy.ocpp.v16.model.security;

import com.cuckooy.ocpp.core.message.Request;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@NoArgsConstructor
public class SecurityEventNotificationRequest implements Request {

    private String type;
    private Instant timestamp;
    private String techInfo;

}
