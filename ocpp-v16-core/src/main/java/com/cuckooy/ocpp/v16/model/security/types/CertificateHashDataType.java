package com.cuckooy.ocpp.v16.model.security.types;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CertificateHashDataType {

    private HashAlgorithmEnumType hashAlgorithm;
    private String issuerNameHash;
    private String issuerKeyHash;
    private String serialNumber;
}
