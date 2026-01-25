package com.cuckooy.ocpp.v16.handler;

import com.cuckooy.ocpp.v16.model.smartcharging.ClearChargingProfileRequest;
import com.cuckooy.ocpp.v16.model.smartcharging.ClearChargingProfileResponse;
import com.cuckooy.ocpp.v16.model.smartcharging.GetCompositeScheduleRequest;
import com.cuckooy.ocpp.v16.model.smartcharging.GetCompositeScheduleResponse;
import com.cuckooy.ocpp.v16.model.smartcharging.SetChargingProfileRequest;
import com.cuckooy.ocpp.v16.model.smartcharging.SetChargingProfileResponse;

public interface ChargePointSmartChargingEventHandler {

    SetChargingProfileResponse handleSetChargingProfile(String sessionId, String identity,
                                                        SetChargingProfileRequest request);

    ClearChargingProfileResponse handleClearChargingProfile(String sessionId, String identity,
                                                            ClearChargingProfileRequest request);

    GetCompositeScheduleResponse handleGetCompositeSchedule(String sessionId, String identity,
                                                            GetCompositeScheduleRequest request);
}
