package com.cuckooy.ocpp.v21.model.bidirectional;

import com.cuckooy.ocpp.core.message.Request;
import lombok.Data;

import java.time.Instant;

/**
 * The type Afrr signal request.
 */
@Data
public class AFRRSignalRequest implements Request {

    private Instant timestamp;
    private Integer signal;
}
