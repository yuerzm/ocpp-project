package com.cuckooy.ocpp.v16.model.firmware;

import com.cuckooy.ocpp.core.message.Response;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The type Get diagnostics response.
 */
@Data
@NoArgsConstructor
public class GetDiagnosticsResponse implements Response {

    private String fileName;


}
