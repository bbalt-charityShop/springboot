/**
 * coderinfo Inc.
 * <p>
 * Copyright (c) 201901-2019 All Rights Reserved.
 */
package com.bbalt.charityshop.business.web.controller;

import com.bbalt.charityshop.business.dal.action.response.ResponseData;
import com.bbalt.charityshop.business.dal.mapper.UserMapper;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fenggang
 * @version Id: TestController.java, v 0.1 2019年12月23日
 * 16:46 fenggang Exp $
 */
@Api
@RestController
public class TestController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping
    public ResponseData test() {
        return new ResponseData(userMapper.selectById(1));
    }
}
