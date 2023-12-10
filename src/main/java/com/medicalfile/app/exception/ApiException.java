package com.medicalfile.app.exception;

public class ApiException extends RuntimeException{
    public ApiException(Exception error) {
        super(error);
    }
    public ApiException(String msg){
        super(msg);
    }
    public ApiException(String s, Exception error) {
        super(s,error);
    }
}
