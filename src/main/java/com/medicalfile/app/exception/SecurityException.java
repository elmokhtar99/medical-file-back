package com.medicalfile.app.exception;

public class SecurityException extends RuntimeException{
    public SecurityException(Exception error) {
        super(error);
    }
    public SecurityException(String msg){
        super(msg);
    }
    public SecurityException(String s, Exception error) {
        super(s,error);
    }
}
