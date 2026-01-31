package com.cuckooy.ocpp.v21.model.common.datatypes;

import com.cuckooy.ocpp.v21.model.common.enumerations.CertificateStatusEnumType;
import com.cuckooy.ocpp.v21.model.common.enumerations.CertificateStatusSourceEnumType;
import lombok.Data;

import java.time.Instant;

/**
 * The type Certificate status type.
 */
@Data
public class CertificateStatusType {

    private CertificateStatusSourceEnumType source;
    private CertificateStatusEnumType status;
    private Instant nextUpdate;
    private CertificateHashDataType certificateHashData;

}
