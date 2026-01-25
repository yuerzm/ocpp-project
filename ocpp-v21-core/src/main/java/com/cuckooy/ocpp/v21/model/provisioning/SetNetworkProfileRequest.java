package com.cuckooy.ocpp.v21.model.provisioning;

import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.v21.model.common.datatypes.NetworkConnectionProfileType;
import lombok.Data;

@Data
public class SetNetworkProfileRequest implements Request {

    private Integer configurationSlot;
    private NetworkConnectionProfileType connectionData;
}
