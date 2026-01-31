package com.cuckooy.ocpp.v20.model.provisioning;

import com.cuckooy.ocpp.core.message.Response;
import com.cuckooy.ocpp.v20.model.common.datatypes.GetVariableResultType;
import lombok.Data;

import java.util.List;

/**
 * The type Get variables response.
 */
@Data
public class GetVariablesResponse implements Response {

    private List<GetVariableResultType> getVariableResult;
}
