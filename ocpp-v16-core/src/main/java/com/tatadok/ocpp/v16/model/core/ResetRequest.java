package com.tatadok.ocpp.v16.model.core;

import com.tatadok.ocpp.core.message.Request;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ResetRequest implements Request {

    private ResetType type;

    public ResetRequest(ResetType type) {
        this.type = type;
    }

}
