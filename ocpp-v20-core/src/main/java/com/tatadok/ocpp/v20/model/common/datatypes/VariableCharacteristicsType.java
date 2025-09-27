package com.tatadok.ocpp.v20.model.common.datatypes;

import com.tatadok.ocpp.v20.model.common.enumerations.DataEnumType;
import lombok.Data;

@Data
public class VariableCharacteristicsType {

    private DataEnumType dataType;
    private Boolean supportsMonitoring;
    private String unit;
    private Double minLimit;
    private Double maxLimit;
    private String valuesList;
}
