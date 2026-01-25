package com.cuckooy.ocpp.v20.model.common.datatypes;

import lombok.Data;

@Data
public class ComponentType {

    private String name;
    private String instance;
    private EVSEType evse;

}
