package com.tatadok.ocpp.v20.model.iso15118;

import com.tatadok.ocpp.core.message.Request;
import com.tatadok.ocpp.v20.model.common.enumerations.GetCertificateIdUseEnumType;
import lombok.Data;

import java.util.List;

@Data
public class GetInstalledCertificateIdsRequest implements Request {

    private List<GetCertificateIdUseEnumType> certificateType;
}
