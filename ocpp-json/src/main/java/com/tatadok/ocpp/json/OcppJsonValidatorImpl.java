package com.tatadok.ocpp.json;

import com.fasterxml.jackson.databind.JsonNode;
import com.networknt.schema.JsonSchema;
import com.networknt.schema.JsonSchemaFactory;
import com.networknt.schema.SchemaValidatorsConfig;
import com.networknt.schema.SpecVersion;
import com.networknt.schema.ValidationMessage;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

public class OcppJsonValidatorImpl implements OcppJsonValidator {

    private final String classpath;
    private final SpecVersion.VersionFlag specVersion;
    private final Map<String, JsonSchema> jsonSchemas;

    public OcppJsonValidatorImpl(String classpath, SpecVersion.VersionFlag specVersion) {
        this.classpath = classpath;
        this.specVersion = specVersion;
        this.jsonSchemas = new HashMap<>();
    }

    @Override
    public List<ValidationMessage> validate(String action, JsonNode payload) {
        JsonSchema jsonSchema = this.jsonSchemas.get(action);
        if (Objects.isNull(jsonSchema)) {
            jsonSchema = getJsonSchema(action + ".json");
            this.jsonSchemas.put(action, jsonSchema);
        }
        return jsonSchema.validate(payload).stream().toList();
    }

    private JsonSchema getJsonSchema(String file) {
        JsonSchemaFactory factory = JsonSchemaFactory.getInstance(this.specVersion);
        SchemaValidatorsConfig validatorsConfig = SchemaValidatorsConfig.builder()
            .failFast(true)
            .locale(Locale.ENGLISH)
            .build();
        return factory.getSchema(getInputStream(file), validatorsConfig);
    }

    protected InputStream getInputStream(String file) {
        ClassPathResource classPathResource = new ClassPathResource(classpath + file);
        try {
            return classPathResource.getInputStream();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
