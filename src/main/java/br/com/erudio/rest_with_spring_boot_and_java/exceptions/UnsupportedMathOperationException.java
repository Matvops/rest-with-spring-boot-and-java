package br.com.erudio.rest_with_spring_boot_and_java.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.io.Serial;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnsupportedMathOperationException extends RuntimeException{

    @Serial
    private static final long serialVersionUID = -4137823949872364847L;

    public UnsupportedMathOperationException(String message) {
        super(message);
    }
}
