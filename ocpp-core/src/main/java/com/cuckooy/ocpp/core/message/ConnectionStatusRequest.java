package com.cuckooy.ocpp.core.message;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@NoArgsConstructor
public class ConnectionStatusRequest implements Request {

    private boolean connected;
    private Instant timestamp;

    public ConnectionStatusRequest(boolean connected, Instant timestamp) {
        this.connected = connected;
        this.timestamp = timestamp;
    }
}
