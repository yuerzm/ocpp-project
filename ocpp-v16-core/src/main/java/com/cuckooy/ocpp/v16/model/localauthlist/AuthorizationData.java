package com.cuckooy.ocpp.v16.model.localauthlist;

import com.cuckooy.ocpp.v16.model.core.IdTagInfo;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The type Authorization data.
 */
@Data
@NoArgsConstructor
public class AuthorizationData {

    private String idTag;

    private IdTagInfo idTagInfo;

}
