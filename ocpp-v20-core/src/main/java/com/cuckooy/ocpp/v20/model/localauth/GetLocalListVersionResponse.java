package com.cuckooy.ocpp.v20.model.localauth;

import com.cuckooy.ocpp.core.message.Response;
import lombok.Data;

/**
 * The type Get local list version response.
 */
@Data
public class GetLocalListVersionResponse implements Response {

    private Integer versionNumber;
}
