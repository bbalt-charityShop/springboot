/**
 * coderinfo Inc.
 * <p>
 * Copyright (c) 201901-2019 All Rights Reserved.
 */
package com.bbalt.charityshop.business.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author fenggang
 * @version Id: LoginAuthInterceptor.java, v 0.1 2019年12月23日
 * 19:56 fenggang Exp $
 */
public class LoginAuthInterceptor extends HandlerInterceptorAdapter {

    private static Logger logger = LoggerFactory.getLogger(LoginAuthInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        logger.info("************:" + request.getRequestURI());

        return true;//super.preHandle(request, response, handler) && this.checkLogin(request, response, handler);

    }

    private boolean checkLogin(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {

        return true;
    }
}
