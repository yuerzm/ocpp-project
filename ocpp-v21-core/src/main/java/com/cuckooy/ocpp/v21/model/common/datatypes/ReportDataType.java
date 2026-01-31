package com.cuckooy.ocpp.v21.model.common.datatypes;

import lombok.Data;

import java.util.List;

/**
 * The type Report data type.
 */
@Data
public class ReportDataType {

    private ComponentType component;
    private VariableType variable;
    private List<VariableAttributeType> variableAttribute;
    private VariableCharacteristicsType variableCharacteristics;
}
