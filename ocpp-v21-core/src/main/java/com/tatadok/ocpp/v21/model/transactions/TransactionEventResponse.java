package com.tatadok.ocpp.v21.model.transactions;

import com.tatadok.ocpp.core.message.Response;
import com.tatadok.ocpp.v21.model.common.datatypes.IdTokenInfoType;
import com.tatadok.ocpp.v21.model.common.datatypes.MessageContentType;
import lombok.Data;

@Data
public class TransactionEventResponse implements Response {

    private Double totalCost;
    private Integer chargingPriority;
    private IdTokenInfoType idTokenInfo;
    private MessageContentType updatedPersonalMessage;
}
