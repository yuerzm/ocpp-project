package com.tatadok.ocpp.v20.model.common.datatypes;

import com.tatadok.ocpp.v20.model.common.enumerations.AuthorizationStatusEnumType;
import lombok.Data;

import java.time.ZonedDateTime;
import java.util.List;

@Data
public class IdTokenInfoType {

    private AuthorizationStatusEnumType status;
    private ZonedDateTime cacheExpiryDateTime;
    private Integer chargingPriority;
    private String language1;
    private List<Integer> evseId;
    private String language2;
    private IdTokenType groupIdToken;
    private MessageContentType personalMessage;
}
