package com.medicalfile.app.exception;

public class RecordNotFoundException extends RuntimeException{
    public RecordNotFoundException(Exception error) {
        super(error);
    }
    public RecordNotFoundException(String msg){
        super(msg);
    }
    public RecordNotFoundException(String s, Exception error) {
        super(s,error);
    }
}
