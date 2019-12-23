/**
 * coderinfo Inc.
 * <p>
 * Copyright (c) 201901-2019 All Rights Reserved.
 */
package com.bbalt.charityshop.business.util.exception;

/**
 * @author fenggang
 * @version Id: LoginException.java, v 0.1 2019年12月23日
 * 16:11 fenggang Exp $
 */
public class LoginException extends RuntimeException {

    private static final long serialVersionUID = -20013062863755581L;

    public LoginException() {
        super();
    }

    public LoginException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public LoginException(String message, Throwable cause) {
        super(message, cause);
    }

    public LoginException(String message) {
        super(message);
    }

    public LoginException(Throwable cause) {
        super(cause);
    }
}
