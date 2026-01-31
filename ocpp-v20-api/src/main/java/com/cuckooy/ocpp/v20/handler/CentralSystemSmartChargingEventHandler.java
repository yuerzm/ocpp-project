package com.cuckooy.ocpp.v20.handler;

import com.cuckooy.ocpp.v20.model.smartcharging.ClearedChargingLimitRequest;
import com.cuckooy.ocpp.v20.model.smartcharging.ClearedChargingLimitResponse;
import com.cuckooy.ocpp.v20.model.smartcharging.NotifyChargingLimitRequest;
import com.cuckooy.ocpp.v20.model.smartcharging.NotifyChargingLimitResponse;
import com.cuckooy.ocpp.v20.model.smartcharging.NotifyEVChargingNeedsRequest;
import com.cuckooy.ocpp.v20.model.smartcharging.NotifyEVChargingNeedsResponse;
import com.cuckooy.ocpp.v20.model.smartcharging.NotifyEVChargingScheduleRequest;
import com.cuckooy.ocpp.v20.model.smartcharging.NotifyEVChargingScheduleResponse;
import com.cuckooy.ocpp.v20.model.smartcharging.ReportChargingProfilesRequest;
import com.cuckooy.ocpp.v20.model.smartcharging.ReportChargingProfilesResponse;

/**
 * The interface Central system smart charging event handler.
 */
public interface CentralSystemSmartChargingEventHandler {

    /**
     * Handle cleared charging limit cleared charging limit response.
     *
     * @param sessionId the session id
     * @param identity  the identity
     * @param request   the request
     * @return the cleared charging limit response
     */
    ClearedChargingLimitResponse handleClearedChargingLimit(String sessionId, String identity,
                                                            ClearedChargingLimitRequest request);

    /**
     * Handle notify charging limit notify charging limit response.
     *
     * @param sessionId the session id
     * @param identity  the identity
     * @param request   the request
     * @return the notify charging limit response
     */
    NotifyChargingLimitResponse handleNotifyChargingLimit(String sessionId, String identity,
                                                          NotifyChargingLimitRequest request);


    /**
     * Handle notify ev charging needs notify ev charging needs response.
     *
     * @param sessionId the session id
     * @param identity  the identity
     * @param request   the request
     * @return the notify ev charging needs response
     */
    NotifyEVChargingNeedsResponse handleNotifyEVChargingNeeds(String sessionId, String identity,
                                                              NotifyEVChargingNeedsRequest request);

    /**
     * Handle notify ev charging schedule notify ev charging schedule response.
     *
     * @param sessionId the session id
     * @param identity  the identity
     * @param request   the request
     * @return the notify ev charging schedule response
     */
    NotifyEVChargingScheduleResponse handleNotifyEVChargingSchedule(String sessionId, String identity,
                                                                    NotifyEVChargingScheduleRequest request);

    /**
     * Handle report charging profiles report charging profiles response.
     *
     * @param sessionId the session id
     * @param identity  the identity
     * @param request   the request
     * @return the report charging profiles response
     */
    ReportChargingProfilesResponse handleReportChargingProfiles(String sessionId, String identity,
                                                                ReportChargingProfilesRequest request);
}

