/**
 * coderinfo Inc.
 * <p>
 * Copyright (c) 201901-2019 All Rights Reserved.
 */
package com.bbalt.charityshop.business.util.exception;

/**
 * @author fenggang
 * @version Id: BusinessException.java, v 0.1 2019年12月23日
 * 16:10 fenggang Exp $
 */
public class BusinessException extends RuntimeException {

    private static final long serialVersionUID = 4893859257700761298L;

    public BusinessException() {
        super();
    }

    public BusinessException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public BusinessException(String message, Throwable cause) {
        super(message, cause);
    }

    public BusinessException(String message) {
        super(message);
    }

    public BusinessException(Throwable cause) {
        super(cause);
    }
}
