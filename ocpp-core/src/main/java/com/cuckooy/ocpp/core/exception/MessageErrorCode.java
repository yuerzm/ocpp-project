package com.cuckooy.ocpp.core.exception;

import lombok.Getter;

/**
 * The enum Message error code.
 */
@Getter
public enum MessageErrorCode {

    /**
     * The Not implemented.
     */
    NotImplemented("Requested Action is not known by receiver"),

    /**
     * The Not supported.
     */
    NotSupported("Requested Action is recognized but not supported by the receiver"),

    /**
     * The Internal error.
     */
    InternalError(
        "An internal error occurred and the receiver was not able to process the requested Action successfully"),

    /**
     * The Protocol error.
     */
    ProtocolError("Payload for Action is incomplete"),

    /**
     * The Security error.
     */
    SecurityError(
        "During the processing of Action a security issue occurred preventing receiver from completing the Action successfully"),

    /**
     * The Formation violation.
     */
    FormationViolation("Payload for Action is syntactically incorrect or not conform the PDU structure for Action"),

    /**
     * The Property constraint violation.
     */
    PropertyConstraintViolation("Payload is syntactically correct but at least one field contains an invalid value"),

    /**
     * The Occurence constraint violation.
     */
    OccurenceConstraintViolation(
        "Payload for Action is syntactically correct but at least one of the fields violates occurence constraints"),

    /**
     * The Type constraint violation.
     */
    TypeConstraintViolation(
        "Payload for Action is syntactically correct but at least one of the fields violates data type constraints"),

    /**
     * The Generic error.
     */
    GenericError("Any other error not covered by the previous ones"),

    /**
     * The Format violation.
     */
    // Specific for OCPP 2.0
    FormatViolation(FormationViolation.value),

    /**
     * The Message type not supported.
     */
    MessageTypeNotSupported("Unsupported message type"),

    /**
     * The Rpc framework error.
     */
    RpcFrameworkError("Content of the call is not a valid RPC Request, for example: UniqueId could not be read.");

    private final String value;

    MessageErrorCode(String value) {
        this.value = value;
    }

    /**
     * From name message error code.
     *
     * @param name the name
     * @return the message error code
     */
    public static MessageErrorCode fromName(String name) {
        for (MessageErrorCode code : MessageErrorCode.values()) {
            if (code.name().equals(name)) {
                return code;
            }
        }
        throw new IllegalArgumentException(name + " is not a valid json message error code.");
    }

}
