package com.weng.exception;

import java.text.MessageFormat;

public class Error {

    public enum Code {
        FORBIDDEN,
        NOT_FOUND,
        INVALID_REQUEST,
        INVALID_STATE,
        INTERNAL_SERVER_ERROR
    }

    public enum Msg {
        FORBIDDEN("Forbidden"),
        NOT_FOUND("{0} not found"),
        INTERNAL_SERVER_ERROR("Application error. Please try again later"),
        USER_EXISTS("{0} already exists"),
        INVALID_CREDENTIAL("Invalid Credential"),
        INVALID_HASH_ID("Invalid hash id `{0}`"),
        INSUFFICIENT_BALANCE("Insufficient balance");

        private final String message;

        Msg(String message) {
            this.message = message;
        }

        public String getMessage(Object... args) {
            return MessageFormat.format(this.message, args);
        }
    }
}
