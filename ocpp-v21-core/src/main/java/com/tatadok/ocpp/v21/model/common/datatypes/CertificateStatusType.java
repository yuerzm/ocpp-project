package com.tatadok.ocpp.v21.model.common.datatypes;

import com.tatadok.ocpp.v21.model.common.enumerations.CertificateStatusEnumType;
import com.tatadok.ocpp.v21.model.common.enumerations.CertificateStatusSourceEnumType;
import lombok.Data;

import java.time.ZonedDateTime;

@Data
public class CertificateStatusType {

    private CertificateStatusSourceEnumType source;
    private CertificateStatusEnumType status;
    private ZonedDateTime nextUpdate;
    private CertificateHashDataType certificateHashData;

}
