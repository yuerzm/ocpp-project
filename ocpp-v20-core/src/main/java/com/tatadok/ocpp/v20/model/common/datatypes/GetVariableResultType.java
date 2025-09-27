package com.tatadok.ocpp.v20.model.common.datatypes;

import com.tatadok.ocpp.v20.model.common.enumerations.AttributeEnumType;
import com.tatadok.ocpp.v20.model.common.enumerations.GetVariableStatusEnumType;
import lombok.Data;

@Data
public class GetVariableResultType {

    private GetVariableStatusEnumType attributeStatus;
    private ComponentType component;
    private VariableType variable;
    private AttributeEnumType attributeType = AttributeEnumType.Actual;
    private String attributeValue;
    private StatusInfoType attributeStatusInfo;
}
