package com.cuckooy.ocpp.server.authentication;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Provider manager.
 */
public class ProviderManager implements AuthenticationManager {

    private final List<AuthenticationProvider> providers;

    /**
     * Instantiates a new Provider manager.
     */
    public ProviderManager() {
        this.providers = new ArrayList<>();
    }

    /**
     * Instantiates a new Provider manager.
     *
     * @param providers the providers
     */
    public ProviderManager(List<AuthenticationProvider> providers) {
        this.providers = providers;
    }

    @Override
    public void authenticate(Authentication authentication) {

        for (AuthenticationProvider provider : providers) {
            provider.authenticate(authentication);
        }

    }
}
