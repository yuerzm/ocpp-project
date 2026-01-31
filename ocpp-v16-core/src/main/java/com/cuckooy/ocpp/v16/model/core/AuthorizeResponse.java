package com.cuckooy.ocpp.v16.model.core;

import com.cuckooy.ocpp.core.message.Response;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The type Authorize response.
 */
@Data
@NoArgsConstructor
public class AuthorizeResponse implements Response {

    private IdTagInfo idTagInfo;

    /**
     * Instantiates a new Authorize response.
     *
     * @param idTagInfo the id tag info
     */
    public AuthorizeResponse(IdTagInfo idTagInfo) {
        this.idTagInfo = idTagInfo;
    }

}
