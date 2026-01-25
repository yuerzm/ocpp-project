package com.cuckooy.ocpp.v21.model.common.datatypes;

import com.cuckooy.ocpp.v21.model.common.enumerations.CertificateStatusSourceEnumType;
import lombok.Data;

import java.util.List;

@Data
public class CertificateStatusRequestInfoType {

    private CertificateStatusSourceEnumType source;
    private List<String> urls;
    private CertificateHashDataType certificateHashData;
}
