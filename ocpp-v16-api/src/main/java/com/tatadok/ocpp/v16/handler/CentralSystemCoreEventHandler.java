package com.tatadok.ocpp.v16.handler;

import com.tatadok.ocpp.v16.model.core.AuthorizeRequest;
import com.tatadok.ocpp.v16.model.core.AuthorizeResponse;
import com.tatadok.ocpp.v16.model.core.BootNotificationRequest;
import com.tatadok.ocpp.v16.model.core.BootNotificationResponse;
import com.tatadok.ocpp.v16.model.core.DataTransferRequest;
import com.tatadok.ocpp.v16.model.core.DataTransferResponse;
import com.tatadok.ocpp.v16.model.core.HeartbeatRequest;
import com.tatadok.ocpp.v16.model.core.HeartbeatResponse;
import com.tatadok.ocpp.v16.model.core.MeterValuesRequest;
import com.tatadok.ocpp.v16.model.core.MeterValuesResponse;
import com.tatadok.ocpp.v16.model.core.StartTransactionRequest;
import com.tatadok.ocpp.v16.model.core.StartTransactionResponse;
import com.tatadok.ocpp.v16.model.core.StatusNotificationRequest;
import com.tatadok.ocpp.v16.model.core.StatusNotificationResponse;
import com.tatadok.ocpp.v16.model.core.StopTransactionRequest;
import com.tatadok.ocpp.v16.model.core.StopTransactionResponse;

public interface CentralSystemCoreEventHandler {

    AuthorizeResponse handleAuthorize(String sessionId, String identity, AuthorizeRequest request);

    BootNotificationResponse handleBootNotification(String sessionId, String identity, BootNotificationRequest request);

    DataTransferResponse handleDataTransfer(String sessionId, String identity, DataTransferRequest request);

    HeartbeatResponse handleHeartbeat(String sessionId, String identity, HeartbeatRequest request);

    MeterValuesResponse handleMeterValues(String sessionId, String identity, MeterValuesRequest request);

    StatusNotificationResponse handleStatusNotification(String sessionId, String identity,
                                                        StatusNotificationRequest request);

    StartTransactionResponse handleStartTransaction(String sessionId, String identity, StartTransactionRequest request);

    StopTransactionResponse handleStopTransaction(String sessionId, String identity, StopTransactionRequest request);
}
