package com.cuckooy.ocpp.v21.model.common.datatypes;

import lombok.Data;

/**
 * The type Signed meter value type.
 */
@Data
public class SignedMeterValueType {

    private String signedMeterData;
    private String signingMethod;
    private String encodingMethod;
    private String publicKey;
}
