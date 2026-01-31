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

/**
 * The interface Charge point provisioning event handler.
 */
public interface ChargePointProvisioningEventHandler {

    /**
     * Handle get variables get variables response.
     *
     * @param sessionId the session id
     * @param identity  the identity
     * @param request   the request
     * @return the get variables response
     */
    GetVariablesResponse handleGetVariables(String sessionId, String identity, GetVariablesRequest request);

    /**
     * Handle set variables set variables response.
     *
     * @param sessionId the session id
     * @param identity  the identity
     * @param request   the request
     * @return the set variables response
     */
    SetVariablesResponse handleSetVariables(String sessionId, String identity, SetVariablesRequest request);

    /**
     * Handle get base report get base report response.
     *
     * @param sessionId the session id
     * @param identity  the identity
     * @param request   the request
     * @return the get base report response
     */
    GetBaseReportResponse handleGetBaseReport(String sessionId, String identity, GetBaseReportRequest request);

    // NotifyReportResponse handleNotifyReport(String sessionId, String identity, NotifyReportRequest request);

    /**
     * Handle get report get report response.
     *
     * @param sessionId the session id
     * @param identity  the identity
     * @param request   the request
     * @return the get report response
     */
    GetReportResponse handleGetReport(String sessionId, String identity, GetReportRequest request);

    /**
     * Handle set network profile set network profile response.
     *
     * @param sessionId the session id
     * @param identity  the identity
     * @param request   the request
     * @return the set network profile response
     */
    SetNetworkProfileResponse handleSetNetworkProfile(String sessionId, String identity,
                                                      SetNetworkProfileRequest request);

    /**
     * Handle reset reset response.
     *
     * @param sessionId the session id
     * @param identity  the identity
     * @param request   the request
     * @return the reset response
     */
    ResetResponse handleReset(String sessionId, String identity, ResetRequest request);

}

