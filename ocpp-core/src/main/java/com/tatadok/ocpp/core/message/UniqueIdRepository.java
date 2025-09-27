package com.tatadok.ocpp.core.message;

import java.util.Optional;

public interface UniqueIdRepository {

    int DEFAULT_TIMEOUT = 30000;

    void save(String uniqueId, String action);

    Optional<String> retrieve(String uniqueId);
}
