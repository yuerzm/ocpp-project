package com.cuckooy.ocpp.v16.server.starter.configure;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.jackson.autoconfigure.JsonMapperBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import tools.jackson.databind.ext.javatime.deser.LocalDateDeserializer;
import tools.jackson.databind.ext.javatime.deser.LocalDateTimeDeserializer;
import tools.jackson.databind.ext.javatime.deser.LocalTimeDeserializer;
import tools.jackson.databind.module.SimpleModule;
import tools.jackson.databind.ser.std.ToStringSerializer;
import tools.jackson.databind.ser.std.ToStringSerializerBase;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@AutoConfiguration
public class JacksonConfiguration {

    @Bean
    public JsonMapperBuilderCustomizer jsonMapperBuilderCustomizer() {

        return builder -> {
            SimpleModule simpleModule = new SimpleModule();

            simpleModule.addSerializer(Long.class, ToStringSerializer.instance);
            simpleModule.addSerializer(Long.TYPE, ToStringSerializer.instance);

            simpleModule.addSerializer(BigInteger.class, ToStringSerializer.instance);
            simpleModule.addSerializer(BigDecimal.class, BigDecimalSerializer.instance);

            simpleModule.addDeserializer(LocalDateTime.class,
                new LocalDateTimeDeserializer(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));

            simpleModule.addDeserializer(LocalDate.class,
                new LocalDateDeserializer(DateTimeFormatter.ofPattern("yyyy-MM-dd")));

            simpleModule.addDeserializer(LocalTime.class,
                new LocalTimeDeserializer(DateTimeFormatter.ofPattern("HH:mm:ss")));

            builder.addModule(simpleModule).build();

        };
    }

    public static class BigDecimalSerializer extends ToStringSerializerBase {

        public final static BigDecimalSerializer instance = new BigDecimalSerializer();

        private BigDecimalSerializer() {
            super(BigDecimal.class);
        }

        @Override
        public String valueToString(Object value) {
            final BigDecimal decimal = (BigDecimal) value;
            return decimal.setScale(6, RoundingMode.HALF_UP).toPlainString();
        }
    }

}
