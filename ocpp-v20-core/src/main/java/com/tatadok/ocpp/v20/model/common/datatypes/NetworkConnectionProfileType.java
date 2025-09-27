package com.tatadok.ocpp.v20.model.common.datatypes;

import com.tatadok.ocpp.v20.model.common.enumerations.OCPPInterfaceEnumType;
import com.tatadok.ocpp.v20.model.common.enumerations.OCPPTransportEnumType;
import com.tatadok.ocpp.v20.model.common.enumerations.OCPPVersionEnumType;
import lombok.Data;

@Data
public class NetworkConnectionProfileType {

    private OCPPVersionEnumType ocppVersion;
    private OCPPTransportEnumType ocppTransport;
    private String ocppCsmsUrl;
    private Integer messageTimeout;
    private Integer securityProfile;
    private OCPPInterfaceEnumType ocppInterface;
    private VPNType vpn;
    private APNType apn;
}
