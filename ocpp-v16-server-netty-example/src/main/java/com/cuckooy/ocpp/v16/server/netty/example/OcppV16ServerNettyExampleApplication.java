package com.cuckooy.ocpp.v16.server.netty.example;

import com.cuckooy.ocpp.server.netty.OcppNettyServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PreDestroy;

/**
 * Main Spring Boot application class for OCPP v1.6 Netty Example.
 */
@SpringBootApplication
public class OcppV16ServerNettyExampleApplication implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(OcppV16ServerNettyExampleApplication.class);

    @Autowired
    private OcppNettyServer ocppNettyServer;

    @Value("${ocpp.netty.port:8887}")
    private int port;

    @Value("${ocpp.netty.path:/ocpp}")
    private String path;

    public static void main(String[] args) {
        SpringApplication.run(OcppV16ServerNettyExampleApplication.class, args);
    }

    @Override
    public void run(String... args) {
        log.info("Starting OCPP v1.6 Netty Server...");
        log.info("WebSocket server will be available at: ws://localhost:{}{}", port, path);
        log.info("Supported OCPP versions: ocpp1.6");

        try {
            // Start the Netty server
            ocppNettyServer.start();
            log.info("OCPP v1.6 Netty Server started successfully on port {}", port);
        } catch (Exception e) {
            log.error("Failed to start OCPP v1.6 Netty Server", e);
            throw new RuntimeException("Failed to start OCPP server", e);
        }
    }

    @PreDestroy
    public void shutdown() {
        log.info("Shutting down OCPP v1.6 Netty Server...");
        try {
            ocppNettyServer.shutdown();
            log.info("OCPP v1.6 Netty Server stopped successfully");
        } catch (Exception e) {
            log.error("Error stopping OCPP v1.6 Netty Server", e);
        }
    }
}
