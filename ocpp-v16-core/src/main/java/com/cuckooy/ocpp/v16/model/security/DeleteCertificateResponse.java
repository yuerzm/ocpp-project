package com.cuckooy.ocpp.v16.model.security;

import com.cuckooy.ocpp.core.message.Response;
import com.cuckooy.ocpp.v16.model.security.types.DeleteCertificateStatusEnumType;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The type Delete certificate response.
 */
@Data
@NoArgsConstructor
public class DeleteCertificateResponse implements Response {

    private DeleteCertificateStatusEnumType status;
}
