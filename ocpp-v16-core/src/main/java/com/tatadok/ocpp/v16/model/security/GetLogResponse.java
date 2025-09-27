package com.tatadok.ocpp.v16.model.security;

import com.tatadok.ocpp.core.message.Response;
import com.tatadok.ocpp.v16.model.security.types.LogStatusEnumType;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class GetLogResponse implements Response {

    private LogStatusEnumType status;
    private String filename;

}
