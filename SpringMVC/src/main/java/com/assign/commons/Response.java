package com.assign.commons;

/**
 * Created by thilanka on 12/3/15.
 */
import java.io.Serializable;

public class Response<T> implements Serializable {

    private boolean success;

    private String message;

    private String errorCode;

    private T result;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public void setErrorCode(Exception e) {

    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

}
