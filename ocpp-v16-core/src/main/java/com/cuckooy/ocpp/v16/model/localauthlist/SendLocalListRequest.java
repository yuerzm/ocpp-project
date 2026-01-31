package com.cuckooy.ocpp.v16.model.localauthlist;


import com.cuckooy.ocpp.core.message.Request;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The type Send local list request.
 */
@Data
@NoArgsConstructor
public class SendLocalListRequest implements Request {

    private Integer listVersion = 0;

    private AuthorizationData[] localAuthorizationList = null;

    private UpdateType updateType;

    /**
     * Instantiates a new Send local list request.
     *
     * @param listVersion the list version
     * @param updateType  the update type
     */
    public SendLocalListRequest(Integer listVersion, UpdateType updateType) {
        this.listVersion = listVersion;
        this.updateType = updateType;
    }

}
