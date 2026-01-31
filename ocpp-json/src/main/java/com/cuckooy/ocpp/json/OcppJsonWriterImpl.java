package com.cuckooy.ocpp.json;

import com.cuckooy.ocpp.core.exception.OcppInternalException;
import com.cuckooy.ocpp.core.message.OcppCallErrorMessage;
import com.cuckooy.ocpp.core.message.OcppCallMessage;
import com.cuckooy.ocpp.core.message.OcppCallResultMessage;
import com.cuckooy.ocpp.core.message.OcppMessage;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Ocpp json writer.
 */
public class OcppJsonWriterImpl implements OcppJsonWriter {

    private final OcppJsonMapper ocppJsonMapper;

    /**
     * Instantiates a new Ocpp json writer.
     *
     * @param ocppJsonMapper the ocpp json mapper
     */
    public OcppJsonWriterImpl(OcppJsonMapper ocppJsonMapper) {
        this.ocppJsonMapper = ocppJsonMapper;
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
            return ocppJsonMapper.writeValueAsString(objects);
        } catch (Exception e) {
            throw new OcppInternalException("Cannot write OCPP JSON-RPC message to JSON.", e);
        }
    }
}
