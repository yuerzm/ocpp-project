package com.cuckooy.ocpp.v20.model.transactions;

import com.cuckooy.ocpp.core.message.Request;
import lombok.Data;

/**
 * The type Get transaction status request.
 */
@Data
public class GetTransactionStatusRequest implements Request {

    private String transactionId;
}
