package com.cuckooy.ocpp.v16.model.core;

import com.cuckooy.ocpp.core.message.Request;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The type Change configuration request.
 */
@Data
@NoArgsConstructor
public class ChangeConfigurationRequest implements Request {

    private String key;

    private String value;

    /**
     * Instantiates a new Change configuration request.
     *
     * @param key   the key
     * @param value the value
     */
    public ChangeConfigurationRequest(String key, String value) {
        this.key = key;
        this.value = value;
    }
}
