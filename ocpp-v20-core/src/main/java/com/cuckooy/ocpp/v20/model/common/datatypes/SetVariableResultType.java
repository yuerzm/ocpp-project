package com.cuckooy.ocpp.v20.model.common.datatypes;

import com.cuckooy.ocpp.v20.model.common.enumerations.AttributeEnumType;
import com.cuckooy.ocpp.v20.model.common.enumerations.SetVariableStatusEnumType;
import lombok.Data;

/**
 * The type Set variable result type.
 */
@Data
public class SetVariableResultType {

    private SetVariableStatusEnumType attributeStatus;
    private ComponentType component;
    private VariableType variable;
    private AttributeEnumType attributeType = AttributeEnumType.Actual;
    private StatusInfoType attributeStatusInfo;
}
