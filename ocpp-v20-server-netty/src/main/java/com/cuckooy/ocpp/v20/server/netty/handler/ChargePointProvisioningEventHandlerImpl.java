package com.cuckooy.ocpp.v20.server.netty.handler;

import com.cuckooy.ocpp.server.netty.AbstractChargePointEventHandler;
import com.cuckooy.ocpp.server.netty.ServerTransport;
import com.cuckooy.ocpp.server.netty.SessionRepository;
import com.cuckooy.ocpp.v20.handler.ChargePointProvisioningEventHandler;
import com.cuckooy.ocpp.v20.model.provisioning.*;

public class ChargePointProvisioningEventHandlerImpl extends AbstractChargePointEventHandler implements ChargePointProvisioningEventHandler {
    public ChargePointProvisioningEventHandlerImpl(ServerTransport serverTransport, SessionRepository sessionRepository) { super(serverTransport, sessionRepository); }
    @Override public GetVariablesResponse handleGetVariables(String identity, GetVariablesRequest request) { return (GetVariablesResponse) invoke(identity, request); }
    @Override public SetVariablesResponse handleSetVariables(String identity, SetVariablesRequest request) { return (SetVariablesResponse) invoke(identity, request); }
    @Override public GetBaseReportResponse handleGetBaseReport(String identity, GetBaseReportRequest request) { return (GetBaseReportResponse) invoke(identity, request); }
    @Override public GetReportResponse handleGetReport(String identity, GetReportRequest request) { return (GetReportResponse) invoke(identity, request); }
    @Override public SetNetworkProfileResponse handleSetNetworkProfile(String identity, SetNetworkProfileRequest request) { return (SetNetworkProfileResponse) invoke(identity, request); }
    @Override public ResetResponse handleReset(String identity, ResetRequest request) { return (ResetResponse) invoke(identity, request); }
}
