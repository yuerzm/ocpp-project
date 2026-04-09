package com.cuckooy.ocpp.v20.handler;

import com.cuckooy.ocpp.v20.model.provisioning.BootNotificationRequest;
import com.cuckooy.ocpp.v20.model.provisioning.BootNotificationResponse;
import com.cuckooy.ocpp.v20.model.provisioning.NotifyReportRequest;
import com.cuckooy.ocpp.v20.model.provisioning.NotifyReportResponse;

/**
 * The interface Central system provisioning event handler.
 */
public interface CentralSystemProvisioningEventHandler {

    /**
     * Handle boot notification boot notification response.
     *
     * @param identity the identity
     * @param request  the request
     * @return the boot notification response
     */
    BootNotificationResponse handleBootNotification(String identity, BootNotificationRequest request);

    /**
     * Handle notify report notify report response.
     *
     * @param identity the identity
     * @param request  the request
     * @return the notify report response
     */
    NotifyReportResponse handleNotifyReport(String identity, NotifyReportRequest request);
}

