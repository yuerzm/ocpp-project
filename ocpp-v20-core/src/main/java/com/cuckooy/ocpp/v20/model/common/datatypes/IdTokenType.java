package com.cuckooy.ocpp.v20.model.common.datatypes;

import com.cuckooy.ocpp.v20.model.common.enumerations.IdTokenEnumType;
import lombok.Data;

import java.util.List;

/**
 * The type Id token type.
 */
@Data
public class IdTokenType {

    private String idToken;
    private IdTokenEnumType type;
    private List<AdditionalInfoType> additionalInfo;
}
