package com.cuckooy.ocpp.v20.server.handler;

import com.cuckooy.ocpp.server.SessionRepository;
import com.cuckooy.ocpp.server.provision.AbstractChargePointEventHandler;
import com.cuckooy.ocpp.v20.handler.ChargePointDiagnosticsEventHandler;
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
import com.cuckooy.ocpp.v20.server.Ocpp20ServerTransport;

public class ChargePointDiagnosticsEventHandlerImpl extends AbstractChargePointEventHandler implements
    ChargePointDiagnosticsEventHandler {

    public ChargePointDiagnosticsEventHandlerImpl(Ocpp20ServerTransport serverTransport,
                                                  SessionRepository sessionRepository) {
        super(serverTransport, sessionRepository);
    }

    @Override
    public ClearVariableMonitoringResponse handleClearVariableMonitoring(String sessionId, String identity,
                                                                         ClearVariableMonitoringRequest request) {
        return (ClearVariableMonitoringResponse) invoke(sessionId, identity, request);
    }

    @Override
    public CustomerInformationResponse handleCustomerInformation(String sessionId, String identity,
                                                                 CustomerInformationRequest request) {
        return (CustomerInformationResponse) invoke(sessionId, identity, request);
    }

    @Override
    public GetLogResponse handleGetLog(String sessionId, String identity, GetLogRequest request) {
        return (GetLogResponse) invoke(sessionId, identity, request);
    }

    @Override
    public GetMonitoringReportResponse handleGetMonitoringReport(String sessionId, String identity,
                                                                 GetMonitoringReportRequest request) {
        return (GetMonitoringReportResponse) invoke(sessionId, identity, request);
    }

    @Override
    public NotifyMonitoringReportResponse handleNotifyMonitoringReport(String sessionId, String identity,
                                                                       NotifyMonitoringReportRequest request) {
        return (NotifyMonitoringReportResponse) invoke(sessionId, identity, request);
    }

    @Override
    public SetMonitoringBaseResponse handleSetMonitoringBase(String sessionId, String identity,
                                                             SetMonitoringBaseRequest request) {
        return (SetMonitoringBaseResponse) invoke(sessionId, identity, request);
    }

    @Override
    public SetMonitoringLevelResponse handleSetMonitoringLevel(String sessionId, String identity,
                                                               SetMonitoringLevelRequest request) {
        return (SetMonitoringLevelResponse) invoke(sessionId, identity, request);
    }

    @Override
    public SetVariableMonitoringResponse handleSetVariableMonitoring(String sessionId, String identity,
                                                                     SetVariableMonitoringRequest request) {
        return (SetVariableMonitoringResponse) invoke(sessionId, identity, request);
    }
}
