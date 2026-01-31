package com.cuckooy.ocpp.v21.model.common.datatypes;

import com.cuckooy.ocpp.v21.model.common.enumerations.HashAlgorithmEnumType;
import lombok.Data;

/**
 * The type Ocsp request data type.
 */
@Data
public class OCSPRequestDataType {

    private HashAlgorithmEnumType hashAlgorithm;
    private String issuerNameHash;
    private String issuerKeyHash;
    private String serialNumber;
    private String responderURL;
}
