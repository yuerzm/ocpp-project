package com.tatadok.ocpp.v16.model.core;

import com.tatadok.ocpp.core.message.Request;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ChangeConfigurationRequest implements Request {

    private String key;

    private String value;

    public ChangeConfigurationRequest(String key, String value) {
        this.key = key;
        this.value = value;
    }
}
