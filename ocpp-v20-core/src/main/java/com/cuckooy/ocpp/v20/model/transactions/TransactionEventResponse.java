package com.cuckooy.ocpp.v20.model.transactions;

import com.cuckooy.ocpp.core.message.Response;
import com.cuckooy.ocpp.v20.model.common.datatypes.IdTokenInfoType;
import com.cuckooy.ocpp.v20.model.common.datatypes.MessageContentType;
import lombok.Data;

/**
 * The type Transaction event response.
 */
@Data
public class TransactionEventResponse implements Response {

    private Double totalCost;
    private Integer chargingPriority;
    private IdTokenInfoType idTokenInfo;
    private MessageContentType updatedPersonalMessage;
}
