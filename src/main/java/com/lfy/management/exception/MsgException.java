package com.lfy.management.exception;

public class MsgException extends RuntimeException {
    public MsgException() {
    }

    public MsgException(String msg) {
        super(msg);
    }
}
