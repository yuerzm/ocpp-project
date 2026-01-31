package com.cuckooy.ocpp.v16.model.core;

import com.cuckooy.ocpp.core.message.Request;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * The type Get configuration request.
 */
@Data
@NoArgsConstructor
public class GetConfigurationRequest implements Request {

    private List<String> key;

}
