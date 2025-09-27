package com.tatadok.ocpp.v21.model.common.datatypes;

import com.tatadok.ocpp.v21.model.common.enumerations.AttributeEnumType;
import com.tatadok.ocpp.v21.model.common.enumerations.MutabilityEnumType;
import lombok.Data;

@Data
public class VariableAttributeType {

    private String value;
    private AttributeEnumType type = AttributeEnumType.Actual;
    private Boolean constant = false;
    private com.tatadok.ocpp.v21.model.common.enumerations.MutabilityEnumType mutability = MutabilityEnumType.ReadWrite;
    private Boolean persistent = false;
}
