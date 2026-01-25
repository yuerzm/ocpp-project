package com.cuckooy.ocpp.v20.model.localauth;

import com.cuckooy.ocpp.core.message.Response;
import lombok.Data;

@Data
public class GetLocalListVersionResponse implements Response {

    private Integer versionNumber;
}
