package com.cuckooy.ocpp.v16.server.starter.provision;

import com.cuckooy.ocpp.server.session.SessionManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;

public class DefaultSessionManagerTask {

    private final Logger logger = LoggerFactory.getLogger(DefaultSessionManagerTask.class);

    private final SessionManager sessionManager;

    public DefaultSessionManagerTask(SessionManager sessionManager) {
        this.sessionManager = sessionManager;
    }

    @Scheduled(fixedDelay = 30000)
    public void schedule() {
        if (logger.isDebugEnabled()) {
            logger.debug("schedule SessionIdleStateTask");
        }
        sessionManager.handle();
    }
}
