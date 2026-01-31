package com.cuckooy.ocpp.v21.model.security;

import com.cuckooy.ocpp.core.message.Request;
import lombok.Data;

import java.time.Instant;

/**
 * The type Security event notification request.
 */
@Data
public class SecurityEventNotificationRequest implements Request {

    private String type;
    private Instant timestamp;
    private String techInfo;
}
