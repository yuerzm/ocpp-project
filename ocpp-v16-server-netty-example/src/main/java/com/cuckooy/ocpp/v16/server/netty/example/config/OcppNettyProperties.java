package com.cuckooy.ocpp.v16.server.netty.example.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Configuration properties for OCPP Netty server.
 */
@ConfigurationProperties(prefix = "ocpp.netty")
public class OcppNettyProperties {

    /**
     * Server port.
     */
    private int port = 8887;

    /**
     * WebSocket path.
     */
    private String path = "/ocpp";

    /**
     * Supported OCPP versions.
     */
    private String[] supportedVersions = new String[]{"ocpp1.6"};

    /**
     * Boss thread count (for accepting connections).
     */
    private int bossThreads = 1;

    /**
     * Worker thread count (for I/O operations).
     */
    private int workerThreads = 0; // 0 means CPU cores * 2

    /**
     * Reader idle timeout in seconds.
     */
    private int readerIdleTimeout = 60;

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String[] getSupportedVersions() {
        return supportedVersions;
    }

    public void setSupportedVersions(String[] supportedVersions) {
        this.supportedVersions = supportedVersions;
    }

    public int getBossThreads() {
        return bossThreads;
    }

    public void setBossThreads(int bossThreads) {
        this.bossThreads = bossThreads;
    }

    public int getWorkerThreads() {
        return workerThreads;
    }

    public void setWorkerThreads(int workerThreads) {
        this.workerThreads = workerThreads;
    }

    public int getReaderIdleTimeout() {
        return readerIdleTimeout;
    }

    public void setReaderIdleTimeout(int readerIdleTimeout) {
        this.readerIdleTimeout = readerIdleTimeout;
    }
}
