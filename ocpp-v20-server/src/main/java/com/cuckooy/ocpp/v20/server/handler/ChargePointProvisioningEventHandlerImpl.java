package com.cuckooy.ocpp.v20.server.handler;

import com.cuckooy.ocpp.server.handler.AbstractChargePointEventHandler;
import com.cuckooy.ocpp.server.session.SessionRepository;
import com.cuckooy.ocpp.v20.handler.ChargePointProvisioningEventHandler;
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
import com.cuckooy.ocpp.v20.server.Ocpp20ServerTransport;

/**
 * The type Charge point provisioning event handler.
 */
public class ChargePointProvisioningEventHandlerImpl extends AbstractChargePointEventHandler implements
    ChargePointProvisioningEventHandler {

    /**
     * Instantiates a new Charge point provisioning event handler.
     *
     * @param serverTransport   the server transport
     * @param sessionRepository the session repository
     */
    public ChargePointProvisioningEventHandlerImpl(Ocpp20ServerTransport serverTransport,
                                                   SessionRepository sessionRepository) {
        super(serverTransport, sessionRepository);
    }

    @Override
    public GetVariablesResponse handleGetVariables(String identity, GetVariablesRequest request) {
        return (GetVariablesResponse) invoke(identity, request);
    }

    @Override
    public SetVariablesResponse handleSetVariables(String identity, SetVariablesRequest request) {
        return (SetVariablesResponse) invoke(identity, request);
    }

    @Override
    public GetBaseReportResponse handleGetBaseReport(String identity, GetBaseReportRequest request) {
        return (GetBaseReportResponse) invoke(identity, request);
    }

    // @Override
    // public NotifyReportResponse handleNotifyReport( String identity, NotifyReportRequest request) {
    //     return (NotifyReportResponse) invoke( identity, request);
    // }

    @Override
    public GetReportResponse handleGetReport(String identity, GetReportRequest request) {
        return (GetReportResponse) invoke(identity, request);
    }

    @Override
    public SetNetworkProfileResponse handleSetNetworkProfile(String identity, SetNetworkProfileRequest request) {
        return (SetNetworkProfileResponse) invoke(identity, request);
    }

    @Override
    public ResetResponse handleReset(String identity, ResetRequest request) {
        return (ResetResponse) invoke(identity, request);
    }
}
