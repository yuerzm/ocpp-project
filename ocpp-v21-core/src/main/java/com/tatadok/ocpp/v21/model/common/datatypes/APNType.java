package com.tatadok.ocpp.v21.model.common.datatypes;

import com.tatadok.ocpp.v21.model.common.enumerations.APNAuthenticationEnumType;
import lombok.Data;

@Data
public class APNType {

    private String apn;
    private APNAuthenticationEnumType apnAuthentication;
    private String apnUserName;
    private String apnPassword;
    private Integer simPin;
    private String preferredNetwork;
    private Boolean useOnlyPreferredNetwork = false;
}
