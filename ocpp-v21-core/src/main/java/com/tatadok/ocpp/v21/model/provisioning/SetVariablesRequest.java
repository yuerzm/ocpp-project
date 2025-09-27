package com.tatadok.ocpp.v21.model.provisioning;

import com.tatadok.ocpp.core.message.Request;
import com.tatadok.ocpp.v21.model.common.datatypes.SetVariableDataType;
import lombok.Data;

import java.util.List;

@Data
public class SetVariablesRequest implements Request {

    private List<SetVariableDataType> setVariableData;
}
