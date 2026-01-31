package com.cuckooy.ocpp.v16.model.core;

import com.cuckooy.ocpp.core.message.Response;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * The type Get configuration response.
 */
@Data
@NoArgsConstructor
public class GetConfigurationResponse implements Response {

    private List<KeyValue> configurationKey;

    private List<String> unknownKey;

    /**
     * Instantiates a new Get configuration response.
     *
     * @param configurationKey the configuration key
     * @param unknownKey       the unknown key
     */
    public GetConfigurationResponse(List<KeyValue> configurationKey, List<String> unknownKey) {
        this.configurationKey = configurationKey;
        this.unknownKey = unknownKey;
    }
}
