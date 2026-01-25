package com.cuckooy.ocpp.v16.model.localauthlist;

import com.cuckooy.ocpp.v16.model.core.IdTagInfo;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AuthorizationData {

    private String idTag;

    private IdTagInfo idTagInfo;

}
