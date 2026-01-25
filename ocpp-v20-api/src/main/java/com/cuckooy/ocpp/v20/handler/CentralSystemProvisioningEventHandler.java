package com.cuckooy.ocpp.v20.handler;

import com.cuckooy.ocpp.v20.model.provisioning.BootNotificationRequest;
import com.cuckooy.ocpp.v20.model.provisioning.BootNotificationResponse;
import com.cuckooy.ocpp.v20.model.provisioning.NotifyReportRequest;
import com.cuckooy.ocpp.v20.model.provisioning.NotifyReportResponse;

public interface CentralSystemProvisioningEventHandler {

    BootNotificationResponse handleBootNotification(String sessionId, String identity, BootNotificationRequest request);

    NotifyReportResponse handleNotifyReport(String sessionId, String identity, NotifyReportRequest request);
}

