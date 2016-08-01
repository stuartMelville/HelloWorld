package com.pluralsight.calcengine.exceptions;

/**
 * Created by stuart on 7/26/2016.
 */
public class InvalidStatementException extends Exception{


    public InvalidStatementException(String reason, String statement){
        super(reason + ": " + statement);
    }

    public InvalidStatementException(String reason, String statement, Throwable cause){
        super(reason + ": " + statement, cause);
    }

}
