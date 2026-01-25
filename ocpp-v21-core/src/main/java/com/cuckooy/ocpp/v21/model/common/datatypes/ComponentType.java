package com.cuckooy.ocpp.v21.model.common.datatypes;

import lombok.Data;

@Data
public class ComponentType {

    private String name;
    private String instance;
    private EVSEType evse;

}
