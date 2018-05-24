package com.github.hellorpc.exception;

/**
 * Hello RPC 基础包异常
 *
 * @author George (GeorgeWorld@qq.com)
 */
public class HelloBaseException extends Exception {
    public HelloBaseException() {
    }

    public HelloBaseException(String message) {
        super(message);
    }

    public HelloBaseException(String message, Throwable cause) {
        super(message, cause);
    }

    public HelloBaseException(Throwable cause) {
        super(cause);
    }
}
