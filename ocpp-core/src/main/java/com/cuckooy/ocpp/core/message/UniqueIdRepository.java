package com.cuckooy.ocpp.core.message;

import java.util.Optional;

/**
 * The interface Unique id repository.
 */
public interface UniqueIdRepository {

    /**
     * The constant DEFAULT_TIMEOUT.
     */
    int DEFAULT_TIMEOUT = 30000;

    /**
     * Save.
     *
     * @param uniqueId the unique id
     * @param action   the action
     */
    void save(String uniqueId, String action);

    /**
     * Retrieve optional.
     *
     * @param uniqueId the unique id
     * @return the optional
     */
    Optional<String> retrieve(String uniqueId);
}
