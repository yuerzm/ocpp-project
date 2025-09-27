package com.tatadok.ocpp.v16.model.core;

import com.tatadok.ocpp.core.message.Response;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ChangeConfigurationResponse implements Response {

    private ConfigurationStatus status;

    public ChangeConfigurationResponse(ConfigurationStatus status) {
        this.status = status;
    }
}
