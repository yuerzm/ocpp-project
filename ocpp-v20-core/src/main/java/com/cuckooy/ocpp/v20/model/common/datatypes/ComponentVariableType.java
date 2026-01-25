package com.cuckooy.ocpp.v20.model.common.datatypes;

import lombok.Data;

@Data
public class ComponentVariableType {

    private ComponentType component;
    private VariableType variable;
}
