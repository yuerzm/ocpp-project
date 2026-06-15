package com.cuckooy.ocpp.server.netty.promise;

import com.cuckooy.ocpp.core.message.Response;

import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface PromiseRepository {

    CompletableFuture<Response> preparePromise(String uniqueId);

    Optional<CompletableFuture<Response>> retrievePromise(String uniqueId);

    void deletePromise(String uniqueId);
}
