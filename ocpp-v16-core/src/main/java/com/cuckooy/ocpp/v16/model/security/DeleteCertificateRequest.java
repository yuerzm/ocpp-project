package com.cuckooy.ocpp.v16.model.security;

import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.v16.model.security.types.CertificateHashDataType;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The type Delete certificate request.
 */
@Data
@NoArgsConstructor
public class DeleteCertificateRequest implements Request {

    private CertificateHashDataType certificateHashData;

}
