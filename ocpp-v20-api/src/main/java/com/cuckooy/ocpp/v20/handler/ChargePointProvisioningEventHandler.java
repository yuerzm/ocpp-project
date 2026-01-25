package com.cuckooy.ocpp.v20.handler;

import com.cuckooy.ocpp.v20.model.provisioning.GetBaseReportRequest;
import com.cuckooy.ocpp.v20.model.provisioning.GetBaseReportResponse;
import com.cuckooy.ocpp.v20.model.provisioning.GetReportRequest;
import com.cuckooy.ocpp.v20.model.provisioning.GetReportResponse;
import com.cuckooy.ocpp.v20.model.provisioning.GetVariablesRequest;
import com.cuckooy.ocpp.v20.model.provisioning.GetVariablesResponse;
import com.cuckooy.ocpp.v20.model.provisioning.ResetRequest;
import com.cuckooy.ocpp.v20.model.provisioning.ResetResponse;
import com.cuckooy.ocpp.v20.model.provisioning.SetNetworkProfileRequest;
import com.cuckooy.ocpp.v20.model.provisioning.SetNetworkProfileResponse;
import com.cuckooy.ocpp.v20.model.provisioning.SetVariablesRequest;
import com.cuckooy.ocpp.v20.model.provisioning.SetVariablesResponse;

public interface ChargePointProvisioningEventHandler {

    GetVariablesResponse handleGetVariables(String sessionId, String identity, GetVariablesRequest request);

    SetVariablesResponse handleSetVariables(String sessionId, String identity, SetVariablesRequest request);

    GetBaseReportResponse handleGetBaseReport(String sessionId, String identity, GetBaseReportRequest request);

    // NotifyReportResponse handleNotifyReport(String sessionId, String identity, NotifyReportRequest request);

    GetReportResponse handleGetReport(String sessionId, String identity, GetReportRequest request);

    SetNetworkProfileResponse handleSetNetworkProfile(String sessionId, String identity,
                                                      SetNetworkProfileRequest request);

    ResetResponse handleReset(String sessionId, String identity, ResetRequest request);

}

