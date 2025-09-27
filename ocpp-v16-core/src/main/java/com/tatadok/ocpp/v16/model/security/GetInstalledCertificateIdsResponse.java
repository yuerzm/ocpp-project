package com.tatadok.ocpp.v16.model.security;

import com.tatadok.ocpp.core.message.Response;
import com.tatadok.ocpp.v16.model.security.types.CertificateHashDataType;
import com.tatadok.ocpp.v16.model.security.types.GetInstalledCertificateStatusEnumType;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class GetInstalledCertificateIdsResponse implements Response {

    private GetInstalledCertificateStatusEnumType status;
    private CertificateHashDataType[] certificateHashData;
}
