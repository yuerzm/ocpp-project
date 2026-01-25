package com.cuckooy.ocpp.v20.handler;

import com.cuckooy.ocpp.v20.model.iso15118.Get15118EVCertificateRequest;
import com.cuckooy.ocpp.v20.model.iso15118.Get15118EVCertificateResponse;
import com.cuckooy.ocpp.v20.model.iso15118.GetCertificateStatusRequest;
import com.cuckooy.ocpp.v20.model.iso15118.GetCertificateStatusResponse;

public interface CentralSystemISO15118EventHandler {

    Get15118EVCertificateResponse handleGet15118EVCertificate(String sessionId, String identity,
                                                              Get15118EVCertificateRequest request);

    GetCertificateStatusResponse handleGetCertificateStatus(String sessionId, String identity,
                                                            GetCertificateStatusRequest request);
}

