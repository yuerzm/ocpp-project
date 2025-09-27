package com.tatadok.ocpp.v16.model.core;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;

@Data
@NoArgsConstructor
public class IdTagInfo {

    private ZonedDateTime expiryDate;

    private String parentIdTag;

    private AuthorizationStatus status;
}
