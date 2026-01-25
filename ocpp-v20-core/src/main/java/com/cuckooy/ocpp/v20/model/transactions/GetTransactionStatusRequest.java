package com.cuckooy.ocpp.v20.model.transactions;

import com.cuckooy.ocpp.core.message.Request;
import lombok.Data;

@Data
public class GetTransactionStatusRequest implements Request {

    private String transactionId;
}
