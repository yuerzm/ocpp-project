package com.cuckooy.ocpp.v20.model.common.datatypes;

import com.cuckooy.ocpp.v20.model.common.enumerations.AuthorizationStatusEnumType;
import lombok.Data;

import java.time.Instant;
import java.util.List;

/**
 * The type Id token info type.
 */
@Data
public class IdTokenInfoType {

    private AuthorizationStatusEnumType status;
    private Instant cacheExpiryDateTime;
    private Integer chargingPriority;
    private String language1;
    private List<Integer> evseId;
    private String language2;
    private IdTokenType groupIdToken;
    private MessageContentType personalMessage;
}
