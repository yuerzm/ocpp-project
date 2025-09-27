package com.tatadok.ocpp.v20.model.iso15118;

import com.tatadok.ocpp.core.message.Request;
import com.tatadok.ocpp.v20.model.common.datatypes.CertificateHashDataType;
import lombok.Data;

@Data
public class DeleteCertificateRequest implements Request {

    private CertificateHashDataType certificateHashData;
}
