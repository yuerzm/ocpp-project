package com.tatadok.ocpp.v21.model.bidirectional;

import com.tatadok.ocpp.core.message.Request;
import lombok.Data;

import java.time.ZonedDateTime;

@Data
public class AFRRSignalRequest implements Request {

    private ZonedDateTime timestamp;
    private Integer signal;
}
