package com.cuckooy.ocpp.server.provision;

import com.cuckooy.ocpp.server.authentication.ChargePointRegistry;
import com.cuckooy.ocpp.server.authentication.ChargePointRegistryRepository;
import org.springframework.util.Assert;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class DefaultChargePointRegistryRepository implements ChargePointRegistryRepository {

    private final Map<String, ChargePointRegistry> registry = new HashMap<>();

    public DefaultChargePointRegistryRepository(Collection<ChargePointRegistry> chargePoints) {
        if (Objects.nonNull(chargePoints)) {
            put(chargePoints);
        }
    }

    @Override
    public ChargePointRegistry find(String identity) {
        return registry.get(identity);
    }

    public void put(ChargePointRegistry chargePoint) {
        this.registry.put(chargePoint.getIdentity(), chargePoint);
    }

    public void put(Collection<ChargePointRegistry> chargePoints) {
        Assert.notNull(chargePoints, "args must not be null");
        chargePoints.forEach(chargePointRegistry -> registry.put(chargePointRegistry.getIdentity(),
            chargePointRegistry));
    }
}
