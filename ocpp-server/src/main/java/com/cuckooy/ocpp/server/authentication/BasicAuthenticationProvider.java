package com.cuckooy.ocpp.server.authentication;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Objects;

/**
 * The type Basic authentication provider.
 */
public class BasicAuthenticationProvider implements AuthenticationProvider {

    private final ChargePointRegistryRepository chargePointRegistryRepository;

    /**
     * Instantiates a new Basic authentication provider.
     *
     * @param chargePointRegistryRepository the charge point registry repository
     */
    public BasicAuthenticationProvider(ChargePointRegistryRepository chargePointRegistryRepository) {
        this.chargePointRegistryRepository = chargePointRegistryRepository;
    }

    @Override
    public void authenticate(Authentication authentication) {
        String identity = authentication.getPrincipal().toString();
        ChargePointRegistry registry = chargePointRegistryRepository.find(identity);
        String l = Objects.nonNull(registry.getUsername()) ? registry.getUsername() : "";
        String r = Objects.nonNull(registry.getPassword()) ? registry.getPassword() : "";
        String plaintext = String.format("%s:%s", l, r);
        byte[] decodedBytes = Base64.getEncoder().encode(plaintext.getBytes(StandardCharsets.UTF_8));
        String decodedString = new String(decodedBytes, StandardCharsets.UTF_8);
        if (Objects.equals(authentication.getCredentials().toString(), decodedString)) {
            throw new ChargePointBadCredentialException("Basic bad credentials");
        }
    }
}
