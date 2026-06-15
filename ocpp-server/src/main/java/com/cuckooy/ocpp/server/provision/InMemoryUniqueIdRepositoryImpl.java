package com.cuckooy.ocpp.server.provision;

import com.cuckooy.ocpp.core.message.UniqueIdRepository;
import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;
import com.github.benmanes.caffeine.cache.RemovalCause;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;
import java.util.concurrent.TimeUnit;

/**
 * The type In memory unique id repository.
 */
public class InMemoryUniqueIdRepositoryImpl implements UniqueIdRepository {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    private final Cache<String, String> cache;

    /**
     * Instantiates a new In memory unique id repository.
     */
    public InMemoryUniqueIdRepositoryImpl() {
        this(30, TimeUnit.SECONDS);
    }

    /**
     * Instantiates a new In memory unique id repository.
     *
     * @param duration the duration
     * @param unit     the unit
     */
    public InMemoryUniqueIdRepositoryImpl(long duration, TimeUnit unit) {
        this.cache = Caffeine
            .newBuilder()
            .expireAfterWrite(duration, unit)
            .removalListener((String key, String promise, RemovalCause cause) -> {
                if (logger.isDebugEnabled()) {
                    logger.debug("Removed UniqueId for key {}, cause: {}, duration: {}, unit: {}",
                        key,
                        cause,
                        duration,
                        unit);
                }
            })
            .build();
    }

    @Override
    public void save(String uniqueId, String action) {
        cache.put(uniqueId, action);
    }

    @Override
    public Optional<String> retrieve(String uniqueId) {
        String action = cache.getIfPresent(uniqueId);
        return Optional.ofNullable(action);
    }
}
