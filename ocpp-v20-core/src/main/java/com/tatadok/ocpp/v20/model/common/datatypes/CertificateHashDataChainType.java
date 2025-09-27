package com.tatadok.ocpp.v20.model.common.datatypes;

import com.tatadok.ocpp.v20.model.common.enumerations.GetCertificateIdUseEnumType;
import lombok.Data;

import java.util.List;

@Data
public class CertificateHashDataChainType {

    private GetCertificateIdUseEnumType certificateType;
    private CertificateHashDataType certificateHashData;
    private List<CertificateHashDataType> childCertificateHashData;
}
