package com.tatadok.ocpp.v16.model.core;

import com.tatadok.ocpp.core.message.Response;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ResetResponse implements Response {

    private ResetStatus status;

}
