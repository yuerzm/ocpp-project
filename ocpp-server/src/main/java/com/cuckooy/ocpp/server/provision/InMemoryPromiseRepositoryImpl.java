package com.cuckooy.ocpp.server.provision;

import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.core.message.Response;
import com.cuckooy.ocpp.server.promise.Promise;
import com.cuckooy.ocpp.server.promise.PromiseRepository;
import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;
import com.github.benmanes.caffeine.cache.RemovalCause;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * The type In memory promise repository.
 */
public class InMemoryPromiseRepositoryImpl implements PromiseRepository {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    private final Cache<String, Promise> promises;

    /**
     * Instantiates a new In memory promise repository.
     */
    public InMemoryPromiseRepositoryImpl() {
        this(60, TimeUnit.SECONDS);
    }

    /**
     * Instantiates a new In memory promise repository.
     *
     * @param duration the duration
     * @param unit     the unit
     */
    public InMemoryPromiseRepositoryImpl(long duration, TimeUnit unit) {
        this.promises = Caffeine
            .newBuilder()
            .expireAfterWrite(duration, unit)
            .removalListener((String key, Promise promise, RemovalCause cause) -> {
                if (logger.isDebugEnabled()) {
                    logger.debug("Removed UniqueId for key {}, cause: {}, duration: {}, unit: {}",
                        key,
                        cause,
                        duration,
                        unit);
                }
                if (cause == RemovalCause.EXPIRED) {
                    promise.getFuture().completeExceptionally(new TimeoutException());
                }
            })
            .build();
    }

    @Override
    public Promise put(String uniqueId, Request request) {
        CompletableFuture<Response> future = new CompletableFuture<>();
        Promise promise = new Promise(uniqueId, request, future);
        promises.put(uniqueId, promise);
        return promise;
    }

    @Override
    public Optional<Promise> get(String uniqueId) {
        Promise promise = promises.getIfPresent(uniqueId);
        return Optional.ofNullable(promise);
    }

    @Override
    public void remove(String uniqueId) {
        promises.invalidate(uniqueId);
    }

}
