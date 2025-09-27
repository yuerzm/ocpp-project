package com.tatadok.ocpp.v16.handler;

import com.tatadok.ocpp.v16.model.smartcharging.ClearChargingProfileRequest;
import com.tatadok.ocpp.v16.model.smartcharging.ClearChargingProfileResponse;
import com.tatadok.ocpp.v16.model.smartcharging.GetCompositeScheduleRequest;
import com.tatadok.ocpp.v16.model.smartcharging.GetCompositeScheduleResponse;
import com.tatadok.ocpp.v16.model.smartcharging.SetChargingProfileRequest;
import com.tatadok.ocpp.v16.model.smartcharging.SetChargingProfileResponse;

public interface ChargePointSmartChargingEventHandler {

    SetChargingProfileResponse handleSetChargingProfile(String sessionId, String identity,
                                                        SetChargingProfileRequest request);

    ClearChargingProfileResponse handleClearChargingProfile(String sessionId, String identity,
                                                            ClearChargingProfileRequest request);

    GetCompositeScheduleResponse handleGetCompositeSchedule(String sessionId, String identity,
                                                            GetCompositeScheduleRequest request);
}
