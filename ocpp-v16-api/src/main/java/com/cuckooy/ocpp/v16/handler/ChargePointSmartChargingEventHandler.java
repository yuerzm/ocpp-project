package com.cuckooy.ocpp.v16.handler;

import com.cuckooy.ocpp.v16.model.smartcharging.ClearChargingProfileRequest;
import com.cuckooy.ocpp.v16.model.smartcharging.ClearChargingProfileResponse;
import com.cuckooy.ocpp.v16.model.smartcharging.GetCompositeScheduleRequest;
import com.cuckooy.ocpp.v16.model.smartcharging.GetCompositeScheduleResponse;
import com.cuckooy.ocpp.v16.model.smartcharging.SetChargingProfileRequest;
import com.cuckooy.ocpp.v16.model.smartcharging.SetChargingProfileResponse;

/**
 * The interface Charge point smart charging event handler.
 */
public interface ChargePointSmartChargingEventHandler {

    /**
     * Handle set charging profile set charging profile response.
     *
     * @param sessionId the session id
     * @param identity  the identity
     * @param request   the request
     * @return the set charging profile response
     */
    SetChargingProfileResponse handleSetChargingProfile(String sessionId, String identity,
                                                        SetChargingProfileRequest request);

    /**
     * Handle clear charging profile clear charging profile response.
     *
     * @param sessionId the session id
     * @param identity  the identity
     * @param request   the request
     * @return the clear charging profile response
     */
    ClearChargingProfileResponse handleClearChargingProfile(String sessionId, String identity,
                                                            ClearChargingProfileRequest request);

    /**
     * Handle get composite schedule get composite schedule response.
     *
     * @param sessionId the session id
     * @param identity  the identity
     * @param request   the request
     * @return the get composite schedule response
     */
    GetCompositeScheduleResponse handleGetCompositeSchedule(String sessionId, String identity,
                                                            GetCompositeScheduleRequest request);
}
