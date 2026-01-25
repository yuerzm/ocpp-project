package com.cuckooy.ocpp.v16.model.core;

import com.cuckooy.ocpp.core.message.Response;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class GetConfigurationResponse implements Response {

    private List<KeyValue> configurationKey;

    private List<String> unknownKey;

    public GetConfigurationResponse(List<KeyValue> configurationKey, List<String> unknownKey) {
        this.configurationKey = configurationKey;
        this.unknownKey = unknownKey;
    }
}
