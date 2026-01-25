package com.cuckooy.ocpp.v21.model.common.datatypes;

import lombok.Data;

@Data
public class SignedMeterValueType {

    private String signedMeterData;
    private String signingMethod;
    private String encodingMethod;
    private String publicKey;
}
