package com.cuckooy.ocpp.v16.model.localauthlist;


import com.cuckooy.ocpp.core.message.Request;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SendLocalListRequest implements Request {

    private Integer listVersion = 0;

    private AuthorizationData[] localAuthorizationList = null;

    private UpdateType updateType;

    public SendLocalListRequest(Integer listVersion, UpdateType updateType) {
        this.listVersion = listVersion;
        this.updateType = updateType;
    }

}
