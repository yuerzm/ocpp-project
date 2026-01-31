package com.cuckooy.ocpp.v21.model.common.datatypes;

import com.cuckooy.ocpp.v21.model.common.enumerations.AttributeEnumType;
import lombok.Data;

/**
 * The type Set variable data type.
 */
@Data
public class SetVariableDataType {

    private String attributeValue;
    private ComponentType component;
    private VariableType variable;
    private AttributeEnumType attributeType = AttributeEnumType.Actual;
}
