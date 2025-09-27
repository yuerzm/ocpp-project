package com.tatadok.ocpp.v21.model.iso15118;

import com.tatadok.ocpp.core.message.Request;
import com.tatadok.ocpp.v21.model.common.datatypes.CertificateHashDataType;
import lombok.Data;

@Data
public class DeleteCertificateRequest implements Request {

    private CertificateHashDataType certificateHashData;
}
