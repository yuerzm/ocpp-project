package com.tatadok.ocpp.v21.model.localauth;

import com.tatadok.ocpp.core.message.Response;
import lombok.Data;

@Data
public class GetLocalListVersionResponse implements Response {

    private Integer versionNumber;
}
