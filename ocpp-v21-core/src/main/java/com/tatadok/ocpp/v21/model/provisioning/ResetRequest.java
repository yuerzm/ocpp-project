package com.tatadok.ocpp.v21.model.provisioning;

import com.tatadok.ocpp.core.message.Request;
import com.tatadok.ocpp.v21.model.common.enumerations.ResetEnumType;
import lombok.Data;

@Data
public class ResetRequest implements Request {

    private ResetEnumType type;
    private Integer evseId;
}
