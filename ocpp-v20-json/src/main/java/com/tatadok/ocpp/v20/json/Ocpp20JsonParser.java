package com.tatadok.ocpp.v20.json;

import com.networknt.schema.SpecificationVersion;
import com.tatadok.ocpp.core.message.Request;
import com.tatadok.ocpp.core.message.Response;
import com.tatadok.ocpp.core.message.UniqueIdRepository;
import com.tatadok.ocpp.json.AbstractOcppJsonParser;
import com.tatadok.ocpp.json.OcppJsonValidatorImpl;
import com.tatadok.ocpp.v20.model.Ocpp20Action;

import java.util.Optional;

public class Ocpp20JsonParser extends AbstractOcppJsonParser {

    private final UniqueIdRepository uniqueIdRepository;

    public Ocpp20JsonParser(Ocpp20JsonMapper ocpp20JsonMapper, UniqueIdRepository uniqueIdRepository) {
        super(ocpp20JsonMapper, new OcppJsonValidatorImpl("scheme/v20/", SpecificationVersion.DRAFT_2020_12));
        this.uniqueIdRepository = uniqueIdRepository;
    }

    @Override
    protected Class<? extends Request> retrieveRequestClass(String action) {
        Ocpp20Action ocpp20Action = Ocpp20Action.valueOf(action);
        return ocpp20Action.getRequestClass();
    }

    @Override
    protected Class<? extends Response> retrieveResponseClass(String uniqueId) {
        Optional<String> retrieveOptional = uniqueIdRepository.retrieve(uniqueId);
        if (retrieveOptional.isEmpty()) {
            throw new RuntimeException();
        }
        Ocpp20Action ocpp20Action = Ocpp20Action.valueOf(retrieveOptional.get());
        return ocpp20Action.getResponseClass();
    }
}
