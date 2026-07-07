package com.cuckooy.ocpp.v16.server.starter.autoconfigure;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.concurrent.TimeUnit;

@Data
@ConfigurationProperties(prefix = CentralSystemProperties.PREFIX)
public class CentralSystemProperties {

    public static final String PREFIX = "ocpp.v16.central";

    private long keepalive = 30;
    private TimeUnit keepaliveTimeUnit = TimeUnit.SECONDS;
    private long promiseTimeout = 60;
    private TimeUnit promiseTimeUnit = TimeUnit.SECONDS;
    private String prefix = "/websocket/";
    private String allowedOrigins = "*";

    public String getPath() {
        return prefix + "*";
    }

}
