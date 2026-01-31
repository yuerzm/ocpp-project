package com.cuckooy.ocpp.v16.model.core;

import com.cuckooy.ocpp.core.message.Response;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The type Change configuration response.
 */
@Data
@NoArgsConstructor
public class ChangeConfigurationResponse implements Response {

    private ConfigurationStatus status;

    /**
     * Instantiates a new Change configuration response.
     *
     * @param status the status
     */
    public ChangeConfigurationResponse(ConfigurationStatus status) {
        this.status = status;
    }
}
