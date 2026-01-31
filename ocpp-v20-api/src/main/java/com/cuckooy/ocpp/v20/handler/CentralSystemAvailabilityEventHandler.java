package com.cuckooy.ocpp.v20.handler;

import com.cuckooy.ocpp.v20.model.availability.HeartbeatRequest;
import com.cuckooy.ocpp.v20.model.availability.HeartbeatResponse;
import com.cuckooy.ocpp.v20.model.availability.NotifyEventRequest;
import com.cuckooy.ocpp.v20.model.availability.NotifyEventResponse;
import com.cuckooy.ocpp.v20.model.availability.StatusNotificationRequest;
import com.cuckooy.ocpp.v20.model.availability.StatusNotificationResponse;

/**
 * The interface Central system availability event handler.
 */
public interface CentralSystemAvailabilityEventHandler {

    /**
     * Handle heartbeat heartbeat response.
     *
     * @param sessionId the session id
     * @param identity  the identity
     * @param request   the request
     * @return the heartbeat response
     */
    HeartbeatResponse handleHeartbeat(String sessionId, String identity, HeartbeatRequest request);

    /**
     * Handle notify event notify event response.
     *
     * @param sessionId the session id
     * @param identity  the identity
     * @param request   the request
     * @return the notify event response
     */
    NotifyEventResponse handleNotifyEvent(String sessionId, String identity, NotifyEventRequest request);

    /**
     * Handle status notification status notification response.
     *
     * @param sessionId the session id
     * @param identity  the identity
     * @param request   the request
     * @return the status notification response
     */
    StatusNotificationResponse handleStatusNotification(String sessionId, String identity,
                                                        StatusNotificationRequest request);
}

