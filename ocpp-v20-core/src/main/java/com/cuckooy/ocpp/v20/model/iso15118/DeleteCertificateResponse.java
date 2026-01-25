package com.cuckooy.ocpp.v20.model.iso15118;

import com.cuckooy.ocpp.core.message.Response;
import com.cuckooy.ocpp.v20.model.common.datatypes.StatusInfoType;
import com.cuckooy.ocpp.v20.model.common.enumerations.DeleteCertificateStatusEnumType;
import lombok.Data;

@Data
public class DeleteCertificateResponse implements Response {

    private DeleteCertificateStatusEnumType status;
    private StatusInfoType statusInfo;
}
