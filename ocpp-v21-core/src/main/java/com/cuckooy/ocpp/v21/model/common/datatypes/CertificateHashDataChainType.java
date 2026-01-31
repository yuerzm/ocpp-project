package com.cuckooy.ocpp.v21.model.common.datatypes;

import com.cuckooy.ocpp.v21.model.common.enumerations.GetCertificateIdUseEnumType;
import lombok.Data;

import java.util.List;

/**
 * The type Certificate hash data chain type.
 */
@Data
public class CertificateHashDataChainType {

    private GetCertificateIdUseEnumType certificateType;
    private CertificateHashDataType certificateHashData;
    private List<CertificateHashDataType> childCertificateHashData;
}
