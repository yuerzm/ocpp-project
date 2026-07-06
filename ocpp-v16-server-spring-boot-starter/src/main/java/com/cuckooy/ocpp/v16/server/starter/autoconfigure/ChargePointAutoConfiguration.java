package com.cuckooy.ocpp.v16.server.starter.autoconfigure;

import com.cuckooy.ocpp.server.authentication.ChargePointRegistry;
import com.cuckooy.ocpp.server.authentication.ChargePointRegistryRepository;
import com.cuckooy.ocpp.v16.server.starter.provision.DefaultChargePointRegistryRepository;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import java.util.List;

@AutoConfiguration
@EnableConfigurationProperties(ChargePointProperties.class)
public class ChargePointAutoConfiguration {

    private final ChargePointProperties properties;

    public ChargePointAutoConfiguration(ChargePointProperties properties) {
        this.properties = properties;
    }

    @Bean
    @ConditionalOnClass(ChargePointRegistryRepository.class)
    @ConditionalOnMissingBean(ChargePointRegistryRepository.class)
    public ChargePointRegistryRepository chargePointRegistryRepository() {
        List<ChargePointRegistry> chargePoints = properties
            .getChargePoints()
            .stream()
            .map(chargePoint -> ChargePointRegistry
                .builder()
                .identity(chargePoint.getIdentity())
                .username(chargePoint.getUsername())
                .password(chargePoint.getPassword())
                .recognized(chargePoint.getRecognized())
                .required(chargePoint.getRequired())
                .build())
            .toList();
        return new DefaultChargePointRegistryRepository(chargePoints);
    }
}
