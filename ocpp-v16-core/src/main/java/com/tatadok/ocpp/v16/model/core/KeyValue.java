package com.tatadok.ocpp.v16.model.core;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class KeyValue {

    private String key;

    private Boolean readonly;

    private String value;
}
