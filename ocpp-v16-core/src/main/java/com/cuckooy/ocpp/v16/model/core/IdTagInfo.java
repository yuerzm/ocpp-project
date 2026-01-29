package com.cuckooy.ocpp.v16.model.core;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@NoArgsConstructor
public class IdTagInfo {

    private Instant expiryDate;

    private String parentIdTag;

    private AuthorizationStatus status;
}
