package com.cuckooy.ocpp.v21.model.common.datatypes;

import com.cuckooy.ocpp.v21.model.common.enumerations.IdTokenEnumType;
import lombok.Data;

import java.util.List;

@Data
public class IdTokenType {

    private String idToken;
    private IdTokenEnumType type;
    private List<AdditionalInfoType> additionalInfo;
}
