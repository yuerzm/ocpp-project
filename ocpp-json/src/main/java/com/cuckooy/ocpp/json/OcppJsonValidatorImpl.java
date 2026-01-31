package com.cuckooy.ocpp.json;

import com.networknt.schema.Error;
import com.networknt.schema.Schema;
import com.networknt.schema.SchemaLocation;
import com.networknt.schema.SchemaRegistry;
import com.networknt.schema.SpecificationVersion;
import tools.jackson.databind.JsonNode;

import java.util.List;

/**
 * The type Ocpp json validator.
 */
public class OcppJsonValidatorImpl implements OcppJsonValidator {

    private final String classpath;
    private final SpecificationVersion specificationVersion;

    /**
     * Instantiates a new Ocpp json validator.
     *
     * @param classpath            the classpath
     * @param specificationVersion the specification version
     */
    public OcppJsonValidatorImpl(String classpath, SpecificationVersion specificationVersion) {
        this.classpath = classpath;
        this.specificationVersion = specificationVersion;
    }

    @Override
    public List<Error> validate(String action, JsonNode payload) {
        SchemaRegistry schemaRegistry = SchemaRegistry.withDefaultDialect(this.specificationVersion);
        String iri = "classpath:" + classpath + action + ".json";
        Schema schema = schemaRegistry.getSchema(SchemaLocation.of(iri));
        schema.initializeValidators();
        return schema.validate(payload).stream().toList();
    }
}
