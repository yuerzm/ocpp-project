package com.cuckooy.ocpp.v20.handler;

import com.cuckooy.ocpp.v20.model.availability.ChangeAvailabilityRequest;
import com.cuckooy.ocpp.v20.model.availability.ChangeAvailabilityResponse;

public interface ChargePointAvailabilityEventHandler {

    ChangeAvailabilityResponse handleChangeAvailability(String sessionId, String identity,
                                                        ChangeAvailabilityRequest request);
}

