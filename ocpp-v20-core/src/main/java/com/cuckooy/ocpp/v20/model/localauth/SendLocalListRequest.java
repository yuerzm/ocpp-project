package com.cuckooy.ocpp.v20.model.localauth;

import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.v20.model.common.datatypes.AuthorizationData;
import com.cuckooy.ocpp.v20.model.common.enumerations.UpdateEnumType;
import lombok.Data;

import java.util.List;

@Data
public class SendLocalListRequest implements Request {

    private Integer versionNumber;
    private UpdateEnumType updateType;
    private List<AuthorizationData> localAuthorizationList;
}
