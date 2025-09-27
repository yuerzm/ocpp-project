package com.tatadok.ocpp.v16.model.security.types;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;

@Data
@NoArgsConstructor
public class FirmwareType {

    private String location;
    private ZonedDateTime retrieveDateTime;
    private ZonedDateTime installDateTime;
    private String signingCertificate;
    private String signature;
}
