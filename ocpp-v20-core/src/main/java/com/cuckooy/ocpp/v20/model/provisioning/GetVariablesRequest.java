package com.cuckooy.ocpp.v20.model.provisioning;

import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.v20.model.common.datatypes.GetVariableDataType;
import lombok.Data;

import java.util.List;

/**
 * The type Get variables request.
 */
@Data
public class GetVariablesRequest implements Request {

    private List<GetVariableDataType> getVariableData;
}
