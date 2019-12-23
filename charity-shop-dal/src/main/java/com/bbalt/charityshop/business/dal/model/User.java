/**
 * coderinfo Inc.
 * <p>
 * Copyright (c) 201901-2019 All Rights Reserved.
 */
package com.bbalt.charityshop.business.dal.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

/**
 * @author fenggang
 * @version Id: User.java, v 0.1 2019年12月23日
 * 19:05 fenggang Exp $
 */
@TableName("ci_uac_user")
public class User implements Serializable {

    /**
     * 用户 ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long userId;

    /**
     * Getter method for
     * property <tt>userId</tt>.
     *
     * @return property
     * value of userId
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * Setter method for property
     * <tt>userId</tt>.
     *
     * @param userId value to be assigned to property
     *               userId
     */
    public void setUserId(Long userId) {

        this.userId = userId;
    }
}
