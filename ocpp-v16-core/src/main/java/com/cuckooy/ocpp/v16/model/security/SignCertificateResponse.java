package com.cuckooy.ocpp.v16.model.security;

import com.cuckooy.ocpp.core.message.Response;
import com.cuckooy.ocpp.v16.model.security.types.GenericStatusEnumType;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The type Sign certificate response.
 */
@Data
@NoArgsConstructor
public class SignCertificateResponse implements Response {

    private GenericStatusEnumType status;

}
