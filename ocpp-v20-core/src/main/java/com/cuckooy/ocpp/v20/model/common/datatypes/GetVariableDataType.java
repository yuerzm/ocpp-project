package com.cuckooy.ocpp.v20.model.common.datatypes;

import com.cuckooy.ocpp.v20.model.common.enumerations.AttributeEnumType;
import lombok.Data;

/**
 * The type Get variable data type.
 */
@Data
public class GetVariableDataType {

    private ComponentType component;
    private VariableType variable;
    private AttributeEnumType attributeType = AttributeEnumType.Actual;
}
