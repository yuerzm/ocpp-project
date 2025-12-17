package com.tatadok.ocpp.v16.json;

import com.networknt.schema.SpecificationVersion;
import com.tatadok.ocpp.core.message.Request;
import com.tatadok.ocpp.core.message.Response;
import com.tatadok.ocpp.core.message.UniqueIdRepository;
import com.tatadok.ocpp.json.AbstractOcppJsonParser;
import com.tatadok.ocpp.json.OcppJsonValidatorImpl;
import com.tatadok.ocpp.v16.model.Ocpp16Action;

import java.util.Optional;

public class Ocpp16JsonParser extends AbstractOcppJsonParser {

    private final UniqueIdRepository uniqueIdRepository;

    public Ocpp16JsonParser(Ocpp16JsonMapper ocpp16JsonMapper, UniqueIdRepository uniqueIdRepository) {
        super(ocpp16JsonMapper, new OcppJsonValidatorImpl("scheme/v16/", SpecificationVersion.DRAFT_2020_12));
        this.uniqueIdRepository = uniqueIdRepository;
    }

    @Override
    protected Class<? extends Request> retrieveRequestClass(String action) {
        Ocpp16Action ocpp16Action = Ocpp16Action.valueOf(action);
        return ocpp16Action.getRequestClass();
    }

    @Override
    protected Class<? extends Response> retrieveResponseClass(String uniqueId) {
        Optional<String> retrieveOptional = uniqueIdRepository.retrieve(uniqueId);
        if (retrieveOptional.isEmpty()) {
            throw new RuntimeException();
        }
        Ocpp16Action ocpp16Action = Ocpp16Action.valueOf(retrieveOptional.get());
        return ocpp16Action.getResponseClass();
    }
}
