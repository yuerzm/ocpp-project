package com.tatadok.ocpp.v20.handler;

import com.tatadok.ocpp.v20.model.smartcharging.ClearedChargingLimitRequest;
import com.tatadok.ocpp.v20.model.smartcharging.ClearedChargingLimitResponse;
import com.tatadok.ocpp.v20.model.smartcharging.NotifyChargingLimitRequest;
import com.tatadok.ocpp.v20.model.smartcharging.NotifyChargingLimitResponse;
import com.tatadok.ocpp.v20.model.smartcharging.NotifyEVChargingNeedsRequest;
import com.tatadok.ocpp.v20.model.smartcharging.NotifyEVChargingNeedsResponse;
import com.tatadok.ocpp.v20.model.smartcharging.NotifyEVChargingScheduleRequest;
import com.tatadok.ocpp.v20.model.smartcharging.NotifyEVChargingScheduleResponse;
import com.tatadok.ocpp.v20.model.smartcharging.ReportChargingProfilesRequest;
import com.tatadok.ocpp.v20.model.smartcharging.ReportChargingProfilesResponse;

public interface CentralSystemSmartChargingEventHandler {

    ClearedChargingLimitResponse handleClearedChargingLimit(String sessionId, String identity,
                                                            ClearedChargingLimitRequest request);

    NotifyChargingLimitResponse handleNotifyChargingLimit(String sessionId, String identity,
                                                          NotifyChargingLimitRequest request);


    NotifyEVChargingNeedsResponse handleNotifyEVChargingNeeds(String sessionId, String identity,
                                                              NotifyEVChargingNeedsRequest request);

    NotifyEVChargingScheduleResponse handleNotifyEVChargingSchedule(String sessionId, String identity,
                                                                    NotifyEVChargingScheduleRequest request);

    ReportChargingProfilesResponse handleReportChargingProfiles(String sessionId, String identity,
                                                                ReportChargingProfilesRequest request);
}

