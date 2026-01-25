package com.cuckooy.ocpp.v21.model.common.datatypes;

import lombok.Data;

import java.time.ZonedDateTime;

@Data
public class FirmwareType {

    private String location;
    private ZonedDateTime retrieveDateTime;
    private ZonedDateTime installDateTime;
    private String signingCertificate;
    private String signature;
}
