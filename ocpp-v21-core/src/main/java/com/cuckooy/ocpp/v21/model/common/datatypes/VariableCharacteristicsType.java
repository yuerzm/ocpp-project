package com.cuckooy.ocpp.v21.model.common.datatypes;

import com.cuckooy.ocpp.v21.model.common.enumerations.DataEnumType;
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
