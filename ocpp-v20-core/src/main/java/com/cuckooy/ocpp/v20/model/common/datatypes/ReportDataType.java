package com.cuckooy.ocpp.v20.model.common.datatypes;

import lombok.Data;

import java.util.List;

@Data
public class ReportDataType {

    private ComponentType component;
    private VariableType variable;
    private List<VariableAttributeType> variableAttribute;
    private VariableCharacteristicsType variableCharacteristics;
}
