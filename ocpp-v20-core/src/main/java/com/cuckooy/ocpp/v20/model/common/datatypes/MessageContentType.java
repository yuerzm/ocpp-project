package com.cuckooy.ocpp.v20.model.common.datatypes;

import com.cuckooy.ocpp.v20.model.common.enumerations.MessageFormatEnumType;
import lombok.Data;

@Data
public class MessageContentType {

    private MessageFormatEnumType format;
    private String content;
    private String language;
}
