package com.cuckooy.ocpp.core.message;

import java.util.Optional;

/**
 * The interface Unique id repository.
 */
public interface UniqueIdRepository {

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
