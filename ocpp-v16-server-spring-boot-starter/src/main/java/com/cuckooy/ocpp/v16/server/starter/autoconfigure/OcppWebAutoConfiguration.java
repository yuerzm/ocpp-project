package com.cuckooy.ocpp.v16.server.starter.autoconfigure;

import com.cuckooy.ocpp.v16.server.web.Ocpp16OperationsController;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Import;

@AutoConfiguration
@Import(Ocpp16OperationsController.class)
public class OcppWebAutoConfiguration {
}