package com.cuckooy.ocpp.v20.handler;

import com.cuckooy.ocpp.v20.model.diagnostics.LogStatusNotificationRequest;
import com.cuckooy.ocpp.v20.model.diagnostics.LogStatusNotificationResponse;
import com.cuckooy.ocpp.v20.model.diagnostics.NotifyCustomerInformationRequest;
import com.cuckooy.ocpp.v20.model.diagnostics.NotifyCustomerInformationResponse;

/**
 * The interface Central system diagnostics event handler.
 */
public interface CentralSystemDiagnosticsEventHandler {

    /**
     * Handle log status notification log status notification response.
     *
     * @param identity the identity
     * @param request  the request
     * @return the log status notification response
     */
    LogStatusNotificationResponse handleLogStatusNotification(String identity, LogStatusNotificationRequest request);

    /**
     * Handle notify customer information notify customer information response.
     *
     * @param identity the identity
     * @param request  the request
     * @return the notify customer information response
     */
    NotifyCustomerInformationResponse handleNotifyCustomerInformation(String identity,
                                                                      NotifyCustomerInformationRequest request);

}

