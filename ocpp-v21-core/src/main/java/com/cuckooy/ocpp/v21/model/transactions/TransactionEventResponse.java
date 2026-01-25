package com.cuckooy.ocpp.v21.model.transactions;

import com.cuckooy.ocpp.core.message.Response;
import com.cuckooy.ocpp.v21.model.common.datatypes.IdTokenInfoType;
import com.cuckooy.ocpp.v21.model.common.datatypes.MessageContentType;
import lombok.Data;

@Data
public class TransactionEventResponse implements Response {

    private Double totalCost;
    private Integer chargingPriority;
    private IdTokenInfoType idTokenInfo;
    private MessageContentType updatedPersonalMessage;
}
