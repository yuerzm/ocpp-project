package com.cuckooy.ocpp.v20.model.transactions;

import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.v20.model.common.datatypes.EVSEType;
import com.cuckooy.ocpp.v20.model.common.datatypes.IdTokenType;
import com.cuckooy.ocpp.v20.model.common.datatypes.MeterValueType;
import com.cuckooy.ocpp.v20.model.common.datatypes.TransactionType;
import com.cuckooy.ocpp.v20.model.common.enumerations.TransactionEventEnumType;
import com.cuckooy.ocpp.v20.model.common.enumerations.TriggerReasonEnumType;
import lombok.Data;

import java.time.Instant;
import java.util.List;

/**
 * The type Transaction event request.
 */
@Data
public class TransactionEventRequest implements Request {

    private TransactionEventEnumType eventType;
    private Instant timestamp;
    private TriggerReasonEnumType triggerReason;
    private Integer seqNo;
    private TransactionType transactionInfo;
    private Integer cableMaxCurrent;
    private EVSEType evse;
    private IdTokenType idToken;
    private List<MeterValueType> meterValue;
    private Integer numberOfPhasesUsed;
    private Boolean offline = false;
    private Integer reservationId;
}
