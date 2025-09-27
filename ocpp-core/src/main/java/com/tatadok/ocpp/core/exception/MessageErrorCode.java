package com.tatadok.ocpp.core.exception;

import lombok.Getter;

@Getter
public enum MessageErrorCode {

    NotImplemented("Requested Action is not known by receiver"),

    NotSupported("Requested Action is recognized but not supported by the receiver"),

    InternalError(
        "An internal error occurred and the receiver was not able to process the requested Action successfully"),

    ProtocolError("Payload for Action is incomplete"),

    SecurityError(
        "During the processing of Action a security issue occurred preventing receiver from completing the Action successfully"),

    FormationViolation("Payload for Action is syntactically incorrect or not conform the PDU structure for Action"),

    PropertyConstraintViolation("Payload is syntactically correct but at least one field contains an invalid value"),

    OccurenceConstraintViolation(
        "Payload for Action is syntactically correct but at least one of the fields violates occurence constraints"),

    TypeConstraintViolation(
        "Payload for Action is syntactically correct but at least one of the fields violates data type constraints"),

    GenericError("Any other error not covered by the previous ones"),

    // Specific for OCPP 2.0
    FormatViolation(FormationViolation.value),

    MessageTypeNotSupported("Unsupported message type"),

    RpcFrameworkError("Content of the call is not a valid RPC Request, for example: UniqueId could not be read.");

    private final String value;

    MessageErrorCode(String value) {
        this.value = value;
    }

    public static MessageErrorCode fromName(String name) {
        for (MessageErrorCode code : MessageErrorCode.values()) {
            if (code.name().equals(name)) {
                return code;
            }
        }
        throw new IllegalArgumentException(name + " is not a valid json message error code.");
    }

}
