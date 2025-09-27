package com.tatadok.ocpp.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.tatadok.ocpp.core.exception.OcppInternalException;
import com.tatadok.ocpp.core.message.OcppCallErrorMessage;
import com.tatadok.ocpp.core.message.OcppCallMessage;
import com.tatadok.ocpp.core.message.OcppCallResultMessage;
import com.tatadok.ocpp.core.message.OcppMessage;

import java.util.ArrayList;
import java.util.List;

public class OcppJsonWriterImpl implements OcppJsonWriter {

    private final OcppJsonMapper objectMapper;

    public OcppJsonWriterImpl(OcppJsonMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @Override
    public String writeJson(OcppMessage message) {
        List<Object> objects = new ArrayList<>();
        objects.add(OcppMessage.INDEX_MESSAGE_TYPE_ID, message.getMessageType().getCode());
        objects.add(OcppMessage.INDEX_MESSAGE_UNIQUE_ID, message.getUniqueId());

        if (message instanceof OcppCallMessage call) {
            objects.add(OcppMessage.INDEX_CALL_ACTION, call.getAction());
            objects.add(OcppMessage.INDEX_CALL_PAYLOAD, call.getPayload());

        } else if (message instanceof OcppCallResultMessage callResult) {
            objects.add(OcppMessage.INDEX_RESULT_PAYLOAD, callResult.getPayload());

        } else if (message instanceof OcppCallErrorMessage callError) {
            objects.add(OcppMessage.INDEX_ERROR_CODE, callError.getErrorCode().name());
            objects.add(OcppMessage.INDEX_ERROR_DESCRIPTION, callError.getErrorDescription());
            objects.add(OcppMessage.INDEX_ERROR_DETAILS, callError.getErrorDetails());
        }
        try {
            return objectMapper.writeValueAsString(objects);
        } catch (JsonProcessingException e) {
            throw new OcppInternalException("Cannot write OCPP JSON-RPC message to JSON.", e);
        }
    }
}
