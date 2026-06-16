package com.cuckooy.ocpp.server.authentication;

import java.util.ArrayList;
import java.util.List;

public class ProviderManager implements AuthenticationManager {

    private final List<AuthenticationProvider> providers;

    public ProviderManager() {
        this.providers = new ArrayList<>();
    }

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
