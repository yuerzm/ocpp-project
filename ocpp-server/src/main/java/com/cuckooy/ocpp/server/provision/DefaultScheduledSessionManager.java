package com.cuckooy.ocpp.server.provision;

import com.cuckooy.ocpp.server.session.SessionManager;
import com.cuckooy.ocpp.server.session.SessionRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.SmartLifecycle;
import org.springframework.web.socket.PingMessage;

import java.io.IOException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class DefaultScheduledSessionManager implements SessionManager, SmartLifecycle {

    private final Logger logger = LoggerFactory.getLogger(DefaultScheduledSessionManager.class);

    private final long duration;
    private final TimeUnit durationUnit;
    private final SessionRepository sessionRepository;
    private final ScheduledExecutorService scheduledExecutorService;
    private ScheduledFuture<?> future;
    private volatile boolean running;

    public DefaultScheduledSessionManager(long duration, TimeUnit durationUnit, SessionRepository sessionRepository,
                                          ScheduledExecutorService scheduledExecutorService) {
        if (duration <= 0) {
            throw new IllegalArgumentException("Duration must be greater than zero");
        }
        this.duration = duration;
        this.durationUnit = durationUnit;
        this.sessionRepository = sessionRepository;
        this.scheduledExecutorService = scheduledExecutorService;
    }

    @Override
    public void handle() {
        sessionRepository.getSessions().forEach(session -> {
            try {
                session.sendMessage(new PingMessage());
            } catch (IOException e) {
                logger.warn("Send Ping failed.", e);
            }
        });
    }

    public void shutdown() {
        scheduledExecutorService.shutdown();
    }

    @Override
    public void start() {
        future = scheduledExecutorService.scheduleAtFixedRate(this::handleSafely, duration, duration, durationUnit);
        running = true;
    }

    @Override
    public void stop() {
        if (future != null) {
            future.cancel(true);
        }
        running = false;
    }

    @Override
    public boolean isRunning() {
        return running;
    }

    private void handleSafely() {
        try {
            handle();
        } catch (Throwable e) {
            logger.error("Heartbeat task failed.", e);
        }
    }
}
