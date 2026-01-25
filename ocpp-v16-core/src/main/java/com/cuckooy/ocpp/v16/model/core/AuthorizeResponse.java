package com.cuckooy.ocpp.v16.model.core;

import com.cuckooy.ocpp.core.message.Response;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AuthorizeResponse implements Response {

    private IdTagInfo idTagInfo;

    public AuthorizeResponse(IdTagInfo idTagInfo) {
        this.idTagInfo = idTagInfo;
    }

}
