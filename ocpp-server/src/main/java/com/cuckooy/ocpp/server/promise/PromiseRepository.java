package com.cuckooy.ocpp.server.promise;

import com.cuckooy.ocpp.core.message.Request;

import java.util.Optional;

/**
 * The interface Promise repository.
 */
public interface PromiseRepository {

    /**
     * Put promise.
     *
     * @param uniqueId the unique id
     * @param request  the request
     * @return the promise
     */
    Promise put(String uniqueId, Request request);

    /**
     * Get optional.
     *
     * @param uniqueId the unique id
     * @return the optional
     */
    Optional<Promise> get(String uniqueId);

    /**
     * Remove.
     *
     * @param uniqueId the unique id
     */
    void remove(String uniqueId);
}
