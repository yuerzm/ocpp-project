package com.cuckooy.ocpp.v21.model.common.datatypes;

import com.cuckooy.ocpp.v21.model.common.enumerations.MessageFormatEnumType;
import lombok.Data;

/**
 * The type Message content type.
 */
@Data
public class MessageContentType {

    private MessageFormatEnumType format;
    private String content;
    private String language;
}
