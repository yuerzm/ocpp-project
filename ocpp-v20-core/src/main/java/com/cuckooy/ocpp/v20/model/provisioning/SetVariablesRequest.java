package com.cuckooy.ocpp.v20.model.provisioning;

import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.v20.model.common.datatypes.SetVariableDataType;
import lombok.Data;

import java.util.List;

@Data
public class SetVariablesRequest implements Request {

    private List<SetVariableDataType> setVariableData;
}
