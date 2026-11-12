package com.cuckooy.ocpp.v16.server.starter.autoconfigure;

import lombok.Data;
import lombok.Getter;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Data
@ConfigurationProperties(prefix = ChargePointProperties.PREFIX)
public class ChargePointProperties {

    public static final String PREFIX = "ocpp.v16.charge-point";

    private List<ChargePoint> chargePoints = new ArrayList<>();

    @Getter
    public static class ChargePoint {

        private final String identity;
        private final String username;
        private final String password;
        private final Boolean recognized;
        private final Boolean required;

        public ChargePoint(String identity, String username, String password, Boolean recognized, Boolean required) {
            Assert.hasText(identity, "identity must not be empty");
            this.identity = identity;
            this.username =
                StringUtils.isNotBlank(username) ? username : RandomStringUtils.secureStrong().nextAlphanumeric(8);
            this.password =
                StringUtils.isNotBlank(password) ? password : RandomStringUtils.secureStrong().nextAlphanumeric(8);
            this.recognized = Objects.nonNull(recognized) && recognized;
            this.required = Objects.nonNull(required) && recognized;
        }
    }
}
