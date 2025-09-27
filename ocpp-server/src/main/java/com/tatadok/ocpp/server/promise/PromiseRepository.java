package com.tatadok.ocpp.server.promise;

import com.tatadok.ocpp.core.message.Response;

import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface PromiseRepository {

    CompletableFuture<Response> preparePromise(String uniqueId);

    Optional<CompletableFuture<Response>> retrievePromise(String uniqueId);

    void deletePromise(String uniqueId);
}
