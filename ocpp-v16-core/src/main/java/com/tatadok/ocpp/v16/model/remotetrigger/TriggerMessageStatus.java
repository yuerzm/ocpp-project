package com.tatadok.ocpp.v16.model.remotetrigger;

public enum TriggerMessageStatus {

    Accepted("Accepted"),

    Rejected("Rejected"),

    NotImplemented("NotImplemented");

    private final String value;

    TriggerMessageStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
