package com.bootcamp.smarthome.exception;

public class InvalidValueException extends HomeAutomationException {
    public InvalidValueException(String message) {
        super(message);
    }
    public InvalidValueException(String field, Object value, String constraint) {
        super("Invalid value for field '" + field + "': '" + value + "' (constraint: '" + constraint + "')");
    }
}
