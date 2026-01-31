package com.cuckooy.ocpp.v16.model.firmware;

import com.cuckooy.ocpp.core.message.Request;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The type Diagnostics status notification request.
 */
@Data
@NoArgsConstructor
public class DiagnosticsStatusNotificationRequest implements Request {

    private DiagnosticsStatus status;
}
