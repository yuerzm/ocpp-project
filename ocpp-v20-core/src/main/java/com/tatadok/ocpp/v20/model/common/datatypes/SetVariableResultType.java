package com.tatadok.ocpp.v20.model.common.datatypes;

import com.tatadok.ocpp.v20.model.common.enumerations.AttributeEnumType;
import com.tatadok.ocpp.v20.model.common.enumerations.SetVariableStatusEnumType;
import lombok.Data;

@Data
public class SetVariableResultType {

    private SetVariableStatusEnumType attributeStatus;
    private ComponentType component;
    private VariableType variable;
    private AttributeEnumType attributeType = AttributeEnumType.Actual;
    private StatusInfoType attributeStatusInfo;
}
