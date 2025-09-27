package com.tatadok.ocpp.v16.model.core;

import com.tatadok.ocpp.core.message.Request;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AuthorizeRequest implements Request {

    private String idTag;

}
