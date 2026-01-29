package com.cuckooy.ocpp.v21.model.common.datatypes;

import com.cuckooy.ocpp.v21.model.common.enumerations.AuthorizationStatusEnumType;
import lombok.Data;

import java.time.Instant;
import java.util.List;

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
