package com.medicalfile.app.controller.advice;


import com.medicalfile.app.dto.BaseResponse;
import com.medicalfile.app.exception.ApiException;
import com.medicalfile.app.exception.RecordNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApplicationExceptionHandler {

    @ExceptionHandler(RecordNotFoundException.class)
    public ResponseEntity<BaseResponse> handleRecordNotFoundException(RecordNotFoundException e){
        return new ResponseEntity<>(new BaseResponse(false,e.getMessage()), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(ApiException.class)
    public ResponseEntity<BaseResponse> handleApiException(ApiException e){
        return new ResponseEntity<>(new BaseResponse(false,e.getMessage()), HttpStatus.EXPECTATION_FAILED);
    }

    @ExceptionHandler(SecurityException.class)
    public ResponseEntity<BaseResponse> handleSecurityException(SecurityException e){
        return new ResponseEntity<>(new BaseResponse(false,e.getMessage()), HttpStatus.FORBIDDEN);
    }
}
