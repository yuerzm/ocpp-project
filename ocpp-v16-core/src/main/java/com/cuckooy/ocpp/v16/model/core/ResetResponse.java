package com.cuckooy.ocpp.v16.model.core;

import com.cuckooy.ocpp.core.message.Response;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The type Reset response.
 */
@Data
@NoArgsConstructor
public class ResetResponse implements Response {

    private ResetStatus status;

}
