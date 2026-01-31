package com.cuckooy.ocpp.v21.model.common.datatypes;

import com.cuckooy.ocpp.v21.model.common.enumerations.APNAuthenticationEnumType;
import lombok.Data;

/**
 * The type Apn type.
 */
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
