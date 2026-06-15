package com.cuckooy.ocpp.v20.server.netty.handler;

import com.cuckooy.ocpp.server.netty.AbstractChargePointEventHandler;
import com.cuckooy.ocpp.server.netty.ServerTransport;
import com.cuckooy.ocpp.server.netty.SessionRepository;
import com.cuckooy.ocpp.v20.handler.ChargePointDiagnosticsEventHandler;
import com.cuckooy.ocpp.v20.model.diagnostics.*;

public class ChargePointDiagnosticsEventHandlerImpl extends AbstractChargePointEventHandler implements ChargePointDiagnosticsEventHandler {
    public ChargePointDiagnosticsEventHandlerImpl(ServerTransport serverTransport, SessionRepository sessionRepository) { super(serverTransport, sessionRepository); }
    @Override public ClearVariableMonitoringResponse handleClearVariableMonitoring(String identity, ClearVariableMonitoringRequest request) { return (ClearVariableMonitoringResponse) invoke(identity, request); }
    @Override public CustomerInformationResponse handleCustomerInformation(String identity, CustomerInformationRequest request) { return (CustomerInformationResponse) invoke(identity, request); }
    @Override public GetLogResponse handleGetLog(String identity, GetLogRequest request) { return (GetLogResponse) invoke(identity, request); }
    @Override public GetMonitoringReportResponse handleGetMonitoringReport(String identity, GetMonitoringReportRequest request) { return (GetMonitoringReportResponse) invoke(identity, request); }
    @Override public NotifyMonitoringReportResponse handleNotifyMonitoringReport(String identity, NotifyMonitoringReportRequest request) { return (NotifyMonitoringReportResponse) invoke(identity, request); }
    @Override public SetMonitoringBaseResponse handleSetMonitoringBase(String identity, SetMonitoringBaseRequest request) { return (SetMonitoringBaseResponse) invoke(identity, request); }
    @Override public SetMonitoringLevelResponse handleSetMonitoringLevel(String identity, SetMonitoringLevelRequest request) { return (SetMonitoringLevelResponse) invoke(identity, request); }
    @Override public SetVariableMonitoringResponse handleSetVariableMonitoring(String identity, SetVariableMonitoringRequest request) { return (SetVariableMonitoringResponse) invoke(identity, request); }
}
