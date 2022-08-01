package com.miller.adrian.fooddonationapiserver.domain.core;

public class ResourceNotFoundException extends Exception{
    public ResourceNotFoundException(String message) {
        super(message);
    }
}
