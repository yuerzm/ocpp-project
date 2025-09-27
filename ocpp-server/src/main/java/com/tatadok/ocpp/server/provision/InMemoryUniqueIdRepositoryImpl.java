package com.tatadok.ocpp.server.provision;

import com.tatadok.ocpp.core.message.UniqueIdRepository;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class InMemoryUniqueIdRepositoryImpl implements UniqueIdRepository {

    private final Map<String, String> map = new ConcurrentHashMap<>();

    @Override
    public void save(String uniqueId, String action) {
        map.put(uniqueId, action);
    }

    @Override
    public Optional<String> retrieve(String uniqueId) {
        String action = map.get(uniqueId);
        return Optional.ofNullable(action);
    }
}
