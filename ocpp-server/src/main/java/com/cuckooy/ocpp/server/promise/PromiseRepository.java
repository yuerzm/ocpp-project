package com.cuckooy.ocpp.server.promise;

import com.cuckooy.ocpp.core.message.Request;

import java.util.Optional;

/**
 * The interface Promise repository.
 */
public interface PromiseRepository {

    /**
     * Prepare promise completable future.
     *
     * @param uniqueId the unique id
     * @return the completable future
     */
    Promise put(String uniqueId, Request request);

    /**
     * Retrieve promise optional.
     *
     * @param uniqueId the unique id
     * @return the optional
     */
    Optional<Promise> get(String uniqueId);

    /**
     * Delete promise.
     *
     * @param uniqueId the unique id
     */
    void remove(String uniqueId);
}
