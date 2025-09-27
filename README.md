# OCPP Java Implementation

This repository contains a Java implementation of the Open Charge Point Protocol (OCPP).


## Project Structure

The project contains multiple modules:

- **ocpp-core**: Core OCPP functionality and interfaces
- **ocpp-json**: JSON serialization/deserialization functionality
- **ocpp-server**: Server-side implementation for handling OCPP connections
- **ocpp-v16-api, ocpp-v16-core, ocpp-v16-json, ocpp-v16-server**: OCPP 1.6 specific implementations
- **ocpp-v20-api, ocpp-v20-core, ocpp-v20-json, ocpp-v20-server**: OCPP 2.0 specific implementations
- **ocpp-v21-core**: OCPP 2.1 specific core functionality

## Features

- Support for OCPP 1.6, 2.0.1, and 2.1
- JSON message parsing and validation
- WebSocket transport implementation
- Central System and Charge Point service interfaces
- Extensible architecture for handling OCPP messages

## Usage

The implementation provides server-side functionality for handling OCPP connections from electric vehicle charging stations. It includes:

- WebSocket endpoint handling
- Message parsing and validation
- Request/response processing
- Session management
- Event handling

## Documentation

For detailed documentation and usage examples, please refer to the official OCPP documentation and specifications.

## Contributing

Contributions are welcome! Please read the contribution guidelines before submitting any changes.

## Acknowledgments

This implementation builds upon the work of the Open Charge Alliance and implements their OCPP standards.