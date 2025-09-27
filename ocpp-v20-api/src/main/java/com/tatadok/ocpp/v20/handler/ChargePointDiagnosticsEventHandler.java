package com.tatadok.ocpp.v20.handler;

import com.tatadok.ocpp.v20.model.diagnostics.ClearVariableMonitoringRequest;
import com.tatadok.ocpp.v20.model.diagnostics.ClearVariableMonitoringResponse;
import com.tatadok.ocpp.v20.model.diagnostics.CustomerInformationRequest;
import com.tatadok.ocpp.v20.model.diagnostics.CustomerInformationResponse;
import com.tatadok.ocpp.v20.model.diagnostics.GetLogRequest;
import com.tatadok.ocpp.v20.model.diagnostics.GetLogResponse;
import com.tatadok.ocpp.v20.model.diagnostics.GetMonitoringReportRequest;
import com.tatadok.ocpp.v20.model.diagnostics.GetMonitoringReportResponse;
import com.tatadok.ocpp.v20.model.diagnostics.NotifyMonitoringReportRequest;
import com.tatadok.ocpp.v20.model.diagnostics.NotifyMonitoringReportResponse;
import com.tatadok.ocpp.v20.model.diagnostics.SetMonitoringBaseRequest;
import com.tatadok.ocpp.v20.model.diagnostics.SetMonitoringBaseResponse;
import com.tatadok.ocpp.v20.model.diagnostics.SetMonitoringLevelRequest;
import com.tatadok.ocpp.v20.model.diagnostics.SetMonitoringLevelResponse;
import com.tatadok.ocpp.v20.model.diagnostics.SetVariableMonitoringRequest;
import com.tatadok.ocpp.v20.model.diagnostics.SetVariableMonitoringResponse;

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

