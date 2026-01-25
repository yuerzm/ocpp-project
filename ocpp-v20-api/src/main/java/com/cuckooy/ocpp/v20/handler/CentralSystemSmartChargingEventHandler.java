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

