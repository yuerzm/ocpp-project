package com.cuckooy.ocpp.v16.model.core;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * The type Key value.
 */
@Data
@AllArgsConstructor
public class KeyValue {

    private String key;

    private Boolean readonly;

    private String value;
}
