package com.tatadok.ocpp.v20.model.common.datatypes;

import com.tatadok.ocpp.v20.model.common.enumerations.VPNEnumType;
import lombok.Data;

@Data
public class VPNType {

    private String server;
    private String user;
    private String password;
    private String key;
    private VPNEnumType type;
    private String group;
}
