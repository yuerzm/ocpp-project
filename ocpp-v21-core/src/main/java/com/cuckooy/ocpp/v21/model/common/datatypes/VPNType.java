package com.cuckooy.ocpp.v21.model.common.datatypes;

import com.cuckooy.ocpp.v21.model.common.enumerations.VPNEnumType;
import lombok.Data;

/**
 * The type Vpn type.
 */
@Data
public class VPNType {

    private String server;
    private String user;
    private String password;
    private String key;
    private VPNEnumType type;
    private String group;
}
