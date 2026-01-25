package com.cuckooy.ocpp.v21.model.common.datatypes;

import lombok.Data;

@Data
public class AddressType {

    private String name;
    private String address1;
    private String address2;
    private String city;
    private String postalCode;
    private String country;
}
