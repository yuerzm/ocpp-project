package com.cuckooy.ocpp.v16.model.security;

import com.cuckooy.ocpp.core.message.Request;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;

@Data
@NoArgsConstructor
public class SecurityEventNotificationRequest implements Request {

    private String type;
    private ZonedDateTime timestamp;
    private String techInfo;

}
