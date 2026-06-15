package com.cuckooy.ocpp.server.netty.promise;

import com.cuckooy.ocpp.core.message.Response;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentSkipListMap;

public final class PromiseContextHolder implements PromiseRepository {

    private static final Map<String, CompletableFuture<Response>> promises = new ConcurrentSkipListMap<>();

    private PromiseContextHolder() {
    }

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

    @Override
    public CompletableFuture<Response> preparePromise(String uniqueId) {
        return prepare(uniqueId);
    }

    @Override
    public Optional<CompletableFuture<Response>> retrievePromise(String uniqueId) {
        return get(uniqueId);
    }

    @Override
    public void deletePromise(String uniqueId) {
        remove(uniqueId);
    }
}
