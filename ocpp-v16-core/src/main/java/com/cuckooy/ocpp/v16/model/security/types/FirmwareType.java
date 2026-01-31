package com.cuckooy.ocpp.v16.model.security.types;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

/**
 * The type Firmware type.
 */
@Data
@NoArgsConstructor
public class FirmwareType {

    private String location;
    private Instant retrieveDateTime;
    private Instant installDateTime;
    private String signingCertificate;
    private String signature;
}
