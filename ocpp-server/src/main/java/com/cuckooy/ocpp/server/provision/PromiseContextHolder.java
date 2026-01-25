package com.cuckooy.ocpp.server.provision;

import com.cuckooy.ocpp.core.message.Response;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentSkipListMap;

public final class PromiseContextHolder {

    private static final Map<String, CompletableFuture<Response>> promises = new ConcurrentSkipListMap<>();

    public static CompletableFuture<Response> prepare(String uniqueId) {
        CompletableFuture<Response> promise = new CompletableFuture<>();
        promises.put(uniqueId, promise);
        return promise;
    }

    public static Optional<CompletableFuture<Response>> get(String uniqueId) {
        return Optional.ofNullable(promises.get(uniqueId));
    }

    public static void remove(String uniqueId) {
        promises.remove(uniqueId);
    }
}
