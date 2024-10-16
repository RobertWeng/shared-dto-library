package com.weng.exception;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import org.apache.commons.lang3.EnumUtils;
import org.springframework.http.HttpStatus;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

@Getter
@JsonIgnoreProperties({"cause", "stackTrace", "localizedMessage", "suppressed"})
public class Catch extends RuntimeException {

    private final Error.Code code;

    @JsonIgnore
    private final HttpStatus httpStatus;

    @JsonInclude(NON_NULL)
    private String field;

    public Catch(int httpStatus, String code, String message) {
        this(HttpStatus.valueOf(httpStatus), EnumUtils.getEnum(Error.Code.class, code), message);
    }

    public Catch(HttpStatus httpStatus, Error.Code code, Error.Msg msg, Object... args) {
        this(httpStatus, code, msg.getMessage(args));
    }

    public Catch(HttpStatus httpStatus, Error.Code code, String msg) {
        super(msg);
        this.httpStatus = httpStatus;
        this.code = code;
    }

    public Catch withField(String field) {
        this.field = field;
        return this;
    }

    public static Catch invalidRequest(Error.Msg msg, Object... args) {
        return new Catch(HttpStatus.BAD_REQUEST, Error.Code.INVALID_REQUEST, msg, args);
    }

    public static Catch entityNotFound(Class entity) {
        return new Catch(HttpStatus.NOT_FOUND, Error.Code.NOT_FOUND, Error.Msg.NOT_FOUND, entity.getSimpleName());
    }

    public static Catch internalServerError() {
        return new Catch(HttpStatus.INTERNAL_SERVER_ERROR, Error.Code.INTERNAL_SERVER_ERROR, Error.Msg.INTERNAL_SERVER_ERROR);
    }

    public static Catch internalServerError(String message) {
        return new Catch(HttpStatus.INTERNAL_SERVER_ERROR, Error.Code.INTERNAL_SERVER_ERROR, message);
    }

    public static Catch forbidden() {
        return new Catch(HttpStatus.FORBIDDEN, Error.Code.FORBIDDEN, Error.Msg.FORBIDDEN);
    }

}
