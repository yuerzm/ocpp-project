package com.cuckooy.ocpp.v20.model.provisioning;

import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.v20.model.common.enumerations.ResetEnumType;
import lombok.Data;

@Data
public class ResetRequest implements Request {

    private ResetEnumType type;
    private Integer evseId;
}
