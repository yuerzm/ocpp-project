package com.tatadok.ocpp.v20.model.common.datatypes;

import com.tatadok.ocpp.v20.model.common.enumerations.IdTokenEnumType;
import lombok.Data;

import java.util.List;

@Data
public class IdTokenType {

    private String idToken;
    private IdTokenEnumType type;
    private List<AdditionalInfoType> additionalInfo;
}
