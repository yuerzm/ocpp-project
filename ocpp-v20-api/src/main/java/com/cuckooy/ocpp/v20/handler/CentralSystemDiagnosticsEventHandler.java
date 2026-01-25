package com.cuckooy.ocpp.v20.handler;

import com.cuckooy.ocpp.v20.model.diagnostics.LogStatusNotificationRequest;
import com.cuckooy.ocpp.v20.model.diagnostics.LogStatusNotificationResponse;
import com.cuckooy.ocpp.v20.model.diagnostics.NotifyCustomerInformationRequest;
import com.cuckooy.ocpp.v20.model.diagnostics.NotifyCustomerInformationResponse;

public interface CentralSystemDiagnosticsEventHandler {

    LogStatusNotificationResponse handleLogStatusNotification(String sessionId, String identity,
                                                              LogStatusNotificationRequest request);

    NotifyCustomerInformationResponse handleNotifyCustomerInformation(String sessionId, String identity,
                                                                      NotifyCustomerInformationRequest request);

}

