package com.tatadok.ocpp.v21.model.iso15118;

import com.tatadok.ocpp.core.message.Response;
import com.tatadok.ocpp.v21.model.common.datatypes.CertificateHashDataChainType;
import com.tatadok.ocpp.v21.model.common.datatypes.StatusInfoType;
import com.tatadok.ocpp.v21.model.common.enumerations.GetInstalledCertificateStatusEnumType;
import lombok.Data;

import java.util.List;

@Data
public class GetInstalledCertificateIdsResponse implements Response {

    private GetInstalledCertificateStatusEnumType status;
    private List<CertificateHashDataChainType> certificateHashDataChain;
    private StatusInfoType statusInfo;
}
