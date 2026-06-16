package com.cuckooy.ocpp.server.provision;

import com.cuckooy.ocpp.server.session.SessionManager;
import com.cuckooy.ocpp.server.session.SessionRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.socket.PingMessage;

import java.io.IOException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * The type Scheduled session manager.
 */
public class ScheduledSessionManagerImpl implements SessionManager {

    private static final long HEARTBEAT_INTERVAL_SECONDS = 20;

    private final Logger logger = LoggerFactory.getLogger(getClass());

    private final SessionRepository sessionRepository;
    private final ScheduledExecutorService executorService;

    /**
     * Instantiates a new Scheduled session manager.
     *
     * @param sessionRepository the session repository
     */
    public ScheduledSessionManagerImpl(SessionRepository sessionRepository) {
        this.sessionRepository = sessionRepository;
        this.executorService = Executors.newSingleThreadScheduledExecutor(r -> {
            Thread t = new Thread(r, "OCPP-IdleState");
            t.setDaemon(true);
            return t;
        });
        this.executorService.scheduleAtFixedRate(this::handle,
            HEARTBEAT_INTERVAL_SECONDS,
            HEARTBEAT_INTERVAL_SECONDS,
            TimeUnit.SECONDS);
    }

    @Override
    public void handle() {
        sessionRepository.getSessions().forEach(session -> {
            try {
                session.sendMessage(new PingMessage());
            } catch (IOException e) {
                logger.error(e.getMessage(), e);
            }
        });
    }

    /**
     * Shutdown.
     */
    public void shutdown() {
        executorService.shutdown();
    }
}
