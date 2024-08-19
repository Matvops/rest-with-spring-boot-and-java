package br.com.erudio.rest_with_spring_boot_and_java.exceptions.handler;

import br.com.erudio.rest_with_spring_boot_and_java.exceptions.ExceptionResponse;
import br.com.erudio.rest_with_spring_boot_and_java.exceptions.UnsupportedMathOperationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.Instant;

@ControllerAdvice
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(Exception.class)
    public final ResponseEntity<ExceptionResponse> handlerAll(Exception ex, WebRequest request){
        ExceptionResponse exceptionResponse = new ExceptionResponse(Instant.now(), ex.getMessage(),
                                                                    request.getDescription(false));
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(exceptionResponse);
    }

    @ExceptionHandler(UnsupportedMathOperationException.class)
    public final ResponseEntity<ExceptionResponse> handlerUnsupportedMathOperation(UnsupportedMathOperationException ex, WebRequest request){
        ExceptionResponse exceptionResponse = new ExceptionResponse(Instant.now(), ex.getMessage(),
                                                                    request.getDescription(false));
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(exceptionResponse);
    }
}
