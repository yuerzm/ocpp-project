package com.cuckooy.ocpp.v21.model.common.datatypes;

import lombok.Data;

/**
 * The type Component variable type.
 */
@Data
public class ComponentVariableType {

    private ComponentType component;
    private VariableType variable;
}
