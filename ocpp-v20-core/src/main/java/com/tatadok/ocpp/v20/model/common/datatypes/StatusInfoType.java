package com.tatadok.ocpp.v20.model.common.datatypes;

import lombok.Data;

@Data
public class StatusInfoType {

    private String reasonCode;
    private String additionalInfo;
}
