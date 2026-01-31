package com.cuckooy.ocpp.v20.handler;

import com.cuckooy.ocpp.v20.model.smartcharging.ClearChargingProfileRequest;
import com.cuckooy.ocpp.v20.model.smartcharging.ClearChargingProfileResponse;
import com.cuckooy.ocpp.v20.model.smartcharging.GetChargingProfilesRequest;
import com.cuckooy.ocpp.v20.model.smartcharging.GetChargingProfilesResponse;
import com.cuckooy.ocpp.v20.model.smartcharging.GetCompositeScheduleRequest;
import com.cuckooy.ocpp.v20.model.smartcharging.GetCompositeScheduleResponse;
import com.cuckooy.ocpp.v20.model.smartcharging.SetChargingProfileRequest;
import com.cuckooy.ocpp.v20.model.smartcharging.SetChargingProfileResponse;

/**
 * The interface Charge point smart charging event handler.
 */
public interface ChargePointSmartChargingEventHandler {

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
     * Handle get charging profiles get charging profiles response.
     *
     * @param sessionId the session id
     * @param identity  the identity
     * @param request   the request
     * @return the get charging profiles response
     */
    GetChargingProfilesResponse handleGetChargingProfiles(String sessionId, String identity,
                                                          GetChargingProfilesRequest request);

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

}

