package com.cuckooy.ocpp.v20.model.common.datatypes;

import lombok.Data;

import java.time.Instant;

@Data
public class FirmwareType {

    private String location;
    private Instant retrieveDateTime;
    private Instant installDateTime;
    private String signingCertificate;
    private String signature;
}
