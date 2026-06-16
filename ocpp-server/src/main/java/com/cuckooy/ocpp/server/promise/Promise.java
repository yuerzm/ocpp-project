package com.cuckooy.ocpp.server.promise;

import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.core.message.Response;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.concurrent.CompletableFuture;

/**
 * The type Promise.
 */
@Getter
@AllArgsConstructor
public class Promise {

    private String uniqueId;
    private Request request;
    private CompletableFuture<Response> future;

}
