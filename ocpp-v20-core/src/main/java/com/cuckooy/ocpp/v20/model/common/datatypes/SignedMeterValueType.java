package com.cuckooy.ocpp.v20.model.common.datatypes;

import lombok.Data;

@Data
public class SignedMeterValueType {

    private String signedMeterData;
    private String signingMethod;
    private String encodingMethod;
    private String publicKey;
}
