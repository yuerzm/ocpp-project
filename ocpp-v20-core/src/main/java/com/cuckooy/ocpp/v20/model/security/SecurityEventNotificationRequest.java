package com.cuckooy.ocpp.v20.model.security;

import com.cuckooy.ocpp.core.message.Request;
import lombok.Data;

import java.time.ZonedDateTime;

@Data
public class SecurityEventNotificationRequest implements Request {

    private String type;
    private ZonedDateTime timestamp;
    private String techInfo;
}
