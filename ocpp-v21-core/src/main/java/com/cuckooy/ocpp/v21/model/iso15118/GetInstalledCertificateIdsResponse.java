package com.cuckooy.ocpp.v21.model.iso15118;

import com.cuckooy.ocpp.core.message.Response;
import com.cuckooy.ocpp.v21.model.common.datatypes.CertificateHashDataChainType;
import com.cuckooy.ocpp.v21.model.common.datatypes.StatusInfoType;
import com.cuckooy.ocpp.v21.model.common.enumerations.GetInstalledCertificateStatusEnumType;
import lombok.Data;

import java.util.List;

@Data
public class GetInstalledCertificateIdsResponse implements Response {

    private GetInstalledCertificateStatusEnumType status;
    private List<CertificateHashDataChainType> certificateHashDataChain;
    private StatusInfoType statusInfo;
}
