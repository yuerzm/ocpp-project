package com.cuckooy.ocpp.v16.server.handler;

import com.cuckooy.ocpp.server.handler.AbstractChargePointEventHandler;
import com.cuckooy.ocpp.server.session.SessionRepository;
import com.cuckooy.ocpp.v16.handler.ChargePointSmartChargingEventHandler;
import com.cuckooy.ocpp.v16.model.smartcharging.*;
import com.cuckooy.ocpp.v16.server.Ocpp16ServerTransport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The type Charge point smart charging event handler.
 */
public class ChargePointSmartChargingEventHandlerImpl extends AbstractChargePointEventHandler implements
    ChargePointSmartChargingEventHandler {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * Instantiates a new Charge point smart charging event handler.
     *
     * @param serverTransport   the server transport
     * @param sessionRepository the session repository
     */
    public ChargePointSmartChargingEventHandlerImpl(Ocpp16ServerTransport serverTransport,
                                                    SessionRepository sessionRepository) {
        super(serverTransport, sessionRepository);
    }

    @Override
    public SetChargingProfileResponse handleSetChargingProfile(String identity, SetChargingProfileRequest request) {
        logger.info("Handle SetChargingProfile, identity: {}, request: {}", identity, request);
        return (SetChargingProfileResponse) invoke(identity, request);
    }

    @Override
    public ClearChargingProfileResponse handleClearChargingProfile(String identity,
                                                                   ClearChargingProfileRequest request) {
        logger.info("Handle ClearChargingProfile, identity: {}, request: {}", identity, request);
        return (ClearChargingProfileResponse) invoke(identity, request);
    }

    @Override
    public GetCompositeScheduleResponse handleGetCompositeSchedule(String identity,
                                                                   GetCompositeScheduleRequest request) {
        logger.info("Handle GetCompositeSchedule, identity: {}, request: {}", identity, request);
        return (GetCompositeScheduleResponse) invoke(identity, request);
    }
}
