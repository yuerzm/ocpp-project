package com.cuckooy.ocpp.v21.model.common.datatypes;

import com.cuckooy.ocpp.v21.model.common.enumerations.HashAlgorithmEnumType;
import lombok.Data;

/**
 * The type Certificate hash data type.
 */
@Data
public class CertificateHashDataType {

    private HashAlgorithmEnumType hashAlgorithm;
    private String issuerNameHash;
    private String issuerKeyHash;
    private String serialNumber;
}
