package com.ljh.returnjson;

public class ResultObject {
    private String code;

    private String message;

    @Override
    public String toString() {
        return "ResultObject{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                '}';
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ResultObject() {
    }

    public ResultObject(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
