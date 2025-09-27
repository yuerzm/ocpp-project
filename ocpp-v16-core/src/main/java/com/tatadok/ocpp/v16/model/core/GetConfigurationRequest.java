package com.tatadok.ocpp.v16.model.core;

import com.tatadok.ocpp.core.message.Request;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class GetConfigurationRequest implements Request {

    private List<String> key;

}
