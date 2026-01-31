package com.cuckooy.ocpp.v21.model.provisioning;

import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.v21.model.common.enumerations.ResetEnumType;
import lombok.Data;

/**
 * The type Reset request.
 */
@Data
public class ResetRequest implements Request {

    private ResetEnumType type;
    private Integer evseId;
}
