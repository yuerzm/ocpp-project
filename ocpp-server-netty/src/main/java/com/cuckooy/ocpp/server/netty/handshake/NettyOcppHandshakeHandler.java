package com.cuckooy.ocpp.server.netty.handshake;

import com.cuckooy.ocpp.core.message.OcppVersion;
import com.cuckooy.ocpp.server.netty.ChannelAttributes;
import com.cuckooy.ocpp.server.netty.authentication.AuthenticationEventHandler;
import com.cuckooy.ocpp.server.netty.authentication.BasicAuthenticationService;
import com.cuckooy.ocpp.server.netty.authentication.BasicAuthenticationServiceImpl;
import com.cuckooy.ocpp.server.netty.authentication.ChargePointAuthenticateRequest;
import com.cuckooy.ocpp.server.netty.authentication.ChargePointAuthenticateResponse;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.handler.codec.http.HttpHeaders;
import io.netty.handler.codec.http.HttpRequest;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Objects;

public class NettyOcppHandshakeHandler extends ChannelInboundHandlerAdapter {

    private static final String DEFAULT_WEBSOCKET_PATH = "/websocket/";

    private final Logger logger = LoggerFactory.getLogger(getClass());

    private final String websocketPath;
    private final AuthenticationEventHandler authenticationEventHandler;
    private final BasicAuthenticationService basicAuthenticationService;
    private final List<OcppVersion> supportedVersions;

    public NettyOcppHandshakeHandler(String websocketPath, AuthenticationEventHandler authenticationEventHandler,
                                     List<OcppVersion> supportedVersions) {
        this(websocketPath, authenticationEventHandler, new BasicAuthenticationServiceImpl(), supportedVersions);
    }

    public NettyOcppHandshakeHandler(String websocketPath, AuthenticationEventHandler authenticationEventHandler,
                                     BasicAuthenticationService basicAuthenticationService,
                                     List<OcppVersion> supportedVersions) {
        this.websocketPath = StringUtils.isNotBlank(websocketPath) ? websocketPath : DEFAULT_WEBSOCKET_PATH;
        this.authenticationEventHandler = Objects.requireNonNull(authenticationEventHandler);
        this.basicAuthenticationService = Objects.requireNonNull(basicAuthenticationService);
        this.supportedVersions = Objects.requireNonNull(supportedVersions);
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        if (msg instanceof HttpRequest httpRequest) {
            if (!authenticateAndSetup(ctx, httpRequest)) {
                // Authentication failed — close the connection
                ctx.close();
                return;
            }
        }
        super.channelRead(ctx, msg);
    }

    private boolean authenticateAndSetup(ChannelHandlerContext ctx, HttpRequest request) {
        String uri = request.uri();

        if (logger.isDebugEnabled()) {
            logger.debug("Before Handshake: {}", uri);
        }

        // 1. Parse identity from URI
        String identity = parseIdentity(uri);
        if (StringUtils.isBlank(identity)) {
            logger.error("Could not parse Charge Point identity from URI: {}", uri);
            return false;
        }

        // 2. Authenticate identity
        ChargePointAuthenticateRequest authenticateRequest = new ChargePointAuthenticateRequest(identity);
        ChargePointAuthenticateResponse authenticateResponse =
            authenticationEventHandler.authenticate(authenticateRequest);

        if (authenticateResponse == null || !authenticateResponse.isRecognized()) {
            logger.error("Charge Point identity '{}' is not recognized.", identity);
            return false;
        }

        // 3. Basic auth
        HttpHeaders headers = request.headers();
        String authorizationHeader = headers.get("Authorization");

        boolean authenticated =
            basicAuthenticationService.authenticate(identity, authorizationHeader, authenticateResponse);
        if (!authenticated) {
            logger.error("Charge Point identity '{}' is not authenticated.", identity);
            return false;
        }

        // 4. Validate Sec-WebSocket-Protocol against supported versions
        String protocolHeader = headers.get("Sec-WebSocket-Protocol");
        if (StringUtils.isBlank(protocolHeader)) {
            logger.error("No protocol (OCPP version) is specified.");
            return false;
        }

        boolean protocolSupported = false;
        for (String requestedProtocol : protocolHeader.split(",")) {
            String trimmed = requestedProtocol.trim();
            for (OcppVersion version : supportedVersions) {
                if (version.getValue().equals(trimmed)) {
                    protocolSupported = true;
                    break;
                }
            }
            if (protocolSupported) {
                break;
            }
        }

        if (!protocolSupported) {
            logger.error("None of the requested protocols '{}' is supported", protocolHeader);
            return false;
        }

        // 5. Set channel attributes
        ctx.channel().attr(ChannelAttributes.CHARGE_POINT_IDENTITY).set(identity);
        ctx.channel().attr(ChannelAttributes.CHARGE_POINT_PROTOCOL).set(protocolHeader);

        if (logger.isDebugEnabled()) {
            logger.debug("Charge Point identity '{}' authenticated with protocol '{}'", identity, protocolHeader);
        }

        return true;
    }

    private String parseIdentity(final String uri) {
        if (StringUtils.isBlank(uri)) {
            return "";
        }
        int index = uri.indexOf(this.websocketPath);
        if (index == -1) {
            return "";
        }
        return uri.substring(index + this.websocketPath.length());
    }
}
