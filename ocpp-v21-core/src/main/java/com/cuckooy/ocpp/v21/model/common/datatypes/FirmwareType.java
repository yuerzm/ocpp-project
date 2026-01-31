package com.cuckooy.ocpp.v21.model.common.datatypes;

import lombok.Data;

import java.time.Instant;

/**
 * The type Firmware type.
 */
@Data
public class FirmwareType {

    private String location;
    private Instant retrieveDateTime;
    private Instant installDateTime;
    private String signingCertificate;
    private String signature;
}
