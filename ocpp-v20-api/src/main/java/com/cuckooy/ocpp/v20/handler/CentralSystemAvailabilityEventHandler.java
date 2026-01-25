package com.cuckooy.ocpp.v20.handler;

import com.cuckooy.ocpp.v20.model.availability.HeartbeatRequest;
import com.cuckooy.ocpp.v20.model.availability.HeartbeatResponse;
import com.cuckooy.ocpp.v20.model.availability.NotifyEventRequest;
import com.cuckooy.ocpp.v20.model.availability.NotifyEventResponse;
import com.cuckooy.ocpp.v20.model.availability.StatusNotificationRequest;
import com.cuckooy.ocpp.v20.model.availability.StatusNotificationResponse;

public interface CentralSystemAvailabilityEventHandler {

    HeartbeatResponse handleHeartbeat(String sessionId, String identity, HeartbeatRequest request);

    NotifyEventResponse handleNotifyEvent(String sessionId, String identity, NotifyEventRequest request);

    StatusNotificationResponse handleStatusNotification(String sessionId, String identity,
                                                        StatusNotificationRequest request);
}

