package com.cuckooy.ocpp.server.promise;

import com.cuckooy.ocpp.core.message.Response;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentSkipListMap;

/**
 * The type Promise context holder.
 */
public final class PromiseContextHolder {

    private static final Map<String, CompletableFuture<Response>> promises = new ConcurrentSkipListMap<>();

    /**
     * Prepare completable future.
     *
     * @param uniqueId the unique id
     * @return the completable future
     */
    public static CompletableFuture<Response> prepare(String uniqueId) {
        CompletableFuture<Response> promise = new CompletableFuture<>();
        promises.put(uniqueId, promise);
        return promise;
    }

    /**
     * Get optional.
     *
     * @param uniqueId the unique id
     * @return the optional
     */
    public static Optional<CompletableFuture<Response>> get(String uniqueId) {
        return Optional.ofNullable(promises.get(uniqueId));
    }

    /**
     * Remove.
     *
     * @param uniqueId the unique id
     */
    public static void remove(String uniqueId) {
        promises.remove(uniqueId);
    }
}
