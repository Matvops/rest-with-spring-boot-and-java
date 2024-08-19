package br.com.erudio.rest_with_spring_boot_and_java.exceptions;

import java.io.Serial;
import java.io.Serializable;
import java.time.Instant;
import java.util.Date;

public class ExceptionResponse implements Serializable {

    @Serial
    private static final long serialVersionUID = 5844880742623101812L;

    private Instant timestamp;
    private String message;
    private String details;

    public ExceptionResponse() { }

    public ExceptionResponse(Instant timestamp, String message, String details) {
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }
}
