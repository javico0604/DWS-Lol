package com.lol.lol.exception;

public class DBConnectionException extends RuntimeException{

    private static final String DESCRIPTION = "Can't establish connection";


    public DBConnectionException(String message) {
        super(DESCRIPTION + ". " + message);
    }
}
