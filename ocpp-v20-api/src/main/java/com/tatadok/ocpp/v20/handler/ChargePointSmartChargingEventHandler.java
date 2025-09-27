package com.tatadok.ocpp.v20.handler;

import com.tatadok.ocpp.v20.model.smartcharging.ClearChargingProfileRequest;
import com.tatadok.ocpp.v20.model.smartcharging.ClearChargingProfileResponse;
import com.tatadok.ocpp.v20.model.smartcharging.GetChargingProfilesRequest;
import com.tatadok.ocpp.v20.model.smartcharging.GetChargingProfilesResponse;
import com.tatadok.ocpp.v20.model.smartcharging.GetCompositeScheduleRequest;
import com.tatadok.ocpp.v20.model.smartcharging.GetCompositeScheduleResponse;
import com.tatadok.ocpp.v20.model.smartcharging.SetChargingProfileRequest;
import com.tatadok.ocpp.v20.model.smartcharging.SetChargingProfileResponse;

public interface ChargePointSmartChargingEventHandler {

    ClearChargingProfileResponse handleClearChargingProfile(String sessionId, String identity,
                                                            ClearChargingProfileRequest request);

    GetChargingProfilesResponse handleGetChargingProfiles(String sessionId, String identity,
                                                          GetChargingProfilesRequest request);

    GetCompositeScheduleResponse handleGetCompositeSchedule(String sessionId, String identity,
                                                            GetCompositeScheduleRequest request);

    SetChargingProfileResponse handleSetChargingProfile(String sessionId, String identity,
                                                        SetChargingProfileRequest request);

}

