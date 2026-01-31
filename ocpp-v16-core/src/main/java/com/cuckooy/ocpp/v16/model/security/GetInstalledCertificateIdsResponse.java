package com.cuckooy.ocpp.v16.model.security;

import com.cuckooy.ocpp.core.message.Response;
import com.cuckooy.ocpp.v16.model.security.types.CertificateHashDataType;
import com.cuckooy.ocpp.v16.model.security.types.GetInstalledCertificateStatusEnumType;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The type Get installed certificate ids response.
 */
@Data
@NoArgsConstructor
public class GetInstalledCertificateIdsResponse implements Response {

    private GetInstalledCertificateStatusEnumType status;
    private CertificateHashDataType[] certificateHashData;
}
