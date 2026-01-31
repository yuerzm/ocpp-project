package com.cuckooy.ocpp.server.promise;

import com.cuckooy.ocpp.core.message.Response;

import java.util.Optional;
import java.util.concurrent.CompletableFuture;

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
    CompletableFuture<Response> preparePromise(String uniqueId);

    /**
     * Retrieve promise optional.
     *
     * @param uniqueId the unique id
     * @return the optional
     */
    Optional<CompletableFuture<Response>> retrievePromise(String uniqueId);

    /**
     * Delete promise.
     *
     * @param uniqueId the unique id
     */
    void deletePromise(String uniqueId);
}
