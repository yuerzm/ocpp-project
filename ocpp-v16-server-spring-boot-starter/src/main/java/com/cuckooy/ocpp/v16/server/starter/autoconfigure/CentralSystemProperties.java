package com.cuckooy.ocpp.v16.server.starter.autoconfigure;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = CentralSystemProperties.PREFIX)
public class CentralSystemProperties {

    public static final String PREFIX = "ocpp.v16.server.central";

    private String prefix = "/websocket/";
    private String allowedOrigins = "*";

    public String getPath() {
        return prefix + "*";
    }

}
