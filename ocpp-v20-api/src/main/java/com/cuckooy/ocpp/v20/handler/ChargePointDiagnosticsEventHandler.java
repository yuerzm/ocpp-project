package com.cuckooy.ocpp.v20.handler;

import com.cuckooy.ocpp.v20.model.diagnostics.ClearVariableMonitoringRequest;
import com.cuckooy.ocpp.v20.model.diagnostics.ClearVariableMonitoringResponse;
import com.cuckooy.ocpp.v20.model.diagnostics.CustomerInformationRequest;
import com.cuckooy.ocpp.v20.model.diagnostics.CustomerInformationResponse;
import com.cuckooy.ocpp.v20.model.diagnostics.GetLogRequest;
import com.cuckooy.ocpp.v20.model.diagnostics.GetLogResponse;
import com.cuckooy.ocpp.v20.model.diagnostics.GetMonitoringReportRequest;
import com.cuckooy.ocpp.v20.model.diagnostics.GetMonitoringReportResponse;
import com.cuckooy.ocpp.v20.model.diagnostics.NotifyMonitoringReportRequest;
import com.cuckooy.ocpp.v20.model.diagnostics.NotifyMonitoringReportResponse;
import com.cuckooy.ocpp.v20.model.diagnostics.SetMonitoringBaseRequest;
import com.cuckooy.ocpp.v20.model.diagnostics.SetMonitoringBaseResponse;
import com.cuckooy.ocpp.v20.model.diagnostics.SetMonitoringLevelRequest;
import com.cuckooy.ocpp.v20.model.diagnostics.SetMonitoringLevelResponse;
import com.cuckooy.ocpp.v20.model.diagnostics.SetVariableMonitoringRequest;
import com.cuckooy.ocpp.v20.model.diagnostics.SetVariableMonitoringResponse;

public interface ChargePointDiagnosticsEventHandler {

    ClearVariableMonitoringResponse handleClearVariableMonitoring(String sessionId, String identity,
                                                                  ClearVariableMonitoringRequest request);

    CustomerInformationResponse handleCustomerInformation(String sessionId, String identity,
                                                          CustomerInformationRequest request);

    GetLogResponse handleGetLog(String sessionId, String identity, GetLogRequest request);

    GetMonitoringReportResponse handleGetMonitoringReport(String sessionId, String identity,
                                                          GetMonitoringReportRequest request);

    NotifyMonitoringReportResponse handleNotifyMonitoringReport(String sessionId, String identity,
                                                                NotifyMonitoringReportRequest request);

    SetMonitoringBaseResponse handleSetMonitoringBase(String sessionId, String identity,
                                                      SetMonitoringBaseRequest request);

    SetMonitoringLevelResponse handleSetMonitoringLevel(String sessionId, String identity,
                                                        SetMonitoringLevelRequest request);

    SetVariableMonitoringResponse handleSetVariableMonitoring(String sessionId, String identity,
                                                              SetVariableMonitoringRequest request);
}

