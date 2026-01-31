package com.cuckooy.ocpp.v16.model.core;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The type Key value.
 */
@Data
@NoArgsConstructor
public class KeyValue {

    private String key;

    private Boolean readonly;

    private String value;
}
