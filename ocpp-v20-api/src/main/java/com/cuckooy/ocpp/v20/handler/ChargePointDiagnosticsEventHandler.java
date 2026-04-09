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

/**
 * The interface Charge point diagnostics event handler.
 */
public interface ChargePointDiagnosticsEventHandler {

    /**
     * Handle clear variable monitoring clear variable monitoring response.
     *
     * @param identity the identity
     * @param request  the request
     * @return the clear variable monitoring response
     */
    ClearVariableMonitoringResponse handleClearVariableMonitoring(String identity,
                                                                  ClearVariableMonitoringRequest request);

    /**
     * Handle customer information customer information response.
     *
     * @param identity the identity
     * @param request  the request
     * @return the customer information response
     */
    CustomerInformationResponse handleCustomerInformation(String identity, CustomerInformationRequest request);

    /**
     * Handle get log get log response.
     *
     * @param identity the identity
     * @param request  the request
     * @return the get log response
     */
    GetLogResponse handleGetLog(String identity, GetLogRequest request);

    /**
     * Handle get monitoring report get monitoring report response.
     *
     * @param identity the identity
     * @param request  the request
     * @return the get monitoring report response
     */
    GetMonitoringReportResponse handleGetMonitoringReport(String identity, GetMonitoringReportRequest request);

    /**
     * Handle notify monitoring report notify monitoring report response.
     *
     * @param identity the identity
     * @param request  the request
     * @return the notify monitoring report response
     */
    NotifyMonitoringReportResponse handleNotifyMonitoringReport(String identity, NotifyMonitoringReportRequest request);

    /**
     * Handle set monitoring base set monitoring base response.
     *
     * @param identity the identity
     * @param request  the request
     * @return the set monitoring base response
     */
    SetMonitoringBaseResponse handleSetMonitoringBase(String identity, SetMonitoringBaseRequest request);

    /**
     * Handle set monitoring level set monitoring level response.
     *
     * @param identity the identity
     * @param request  the request
     * @return the set monitoring level response
     */
    SetMonitoringLevelResponse handleSetMonitoringLevel(String identity, SetMonitoringLevelRequest request);

    /**
     * Handle set variable monitoring set variable monitoring response.
     *
     * @param identity the identity
     * @param request  the request
     * @return the set variable monitoring response
     */
    SetVariableMonitoringResponse handleSetVariableMonitoring(String identity, SetVariableMonitoringRequest request);
}

