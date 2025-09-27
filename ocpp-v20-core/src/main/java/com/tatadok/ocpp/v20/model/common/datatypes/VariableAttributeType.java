package com.tatadok.ocpp.v20.model.common.datatypes;

import com.tatadok.ocpp.v20.model.common.enumerations.AttributeEnumType;
import com.tatadok.ocpp.v20.model.common.enumerations.MutabilityEnumType;
import lombok.Data;

@Data
public class VariableAttributeType {

    private String value;
    private AttributeEnumType type = AttributeEnumType.Actual;
    private Boolean constant = false;
    private MutabilityEnumType mutability = MutabilityEnumType.ReadWrite;
    private Boolean persistent = false;
}
