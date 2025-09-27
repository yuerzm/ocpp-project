package com.tatadok.ocpp.v20.model.provisioning;

import com.tatadok.ocpp.core.message.Request;
import com.tatadok.ocpp.v20.model.common.datatypes.GetVariableDataType;
import lombok.Data;

import java.util.List;

@Data
public class GetVariablesRequest implements Request {

    private List<GetVariableDataType> getVariableData;
}
