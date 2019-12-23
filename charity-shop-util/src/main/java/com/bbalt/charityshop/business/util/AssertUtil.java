/**
 * coderinfo Inc.
 * <p>
 * Copyright (c) 201901-2019 All Rights Reserved.
 */
package com.bbalt.charityshop.business.util;

import com.bbalt.charityshop.business.util.exception.BusinessException;
import com.google.common.base.Strings;
import org.springframework.util.CollectionUtils;

import java.util.Collection;

/**
 * 断言工具类
 *
 *  @author fenggang
 *  @version Id: LoginException.java, v 0.1 2019年12月23日
 *  16:11 fenggang Exp $
 */
public class AssertUtil {

    /**
     * <p>断言对象为空，否则抛出传入的异常</p>
     *
     * @param str 断言字符串
     * @param msg 错误消息
     */
    public static void notBlank(String str, String msg) {
        if (Strings.isNullOrEmpty(str)) {
            throw new BusinessException(msg);
        }
    }

    /**
     * <p>断言对象为空，否则抛出传入的异常</p>
     *
     * @param str 断言字符串
     * @param msgformat  错误消息(可格式化)
     * @param formatArgs 格式化参数
     * @see java.util.Formatter
     */
    public static void notBlank(String str, String msgformat,
                                Object... formatArgs) {
        notBlank(str, String.format(msgformat, formatArgs));
    }

    /**
     * <p>断言集合不为空或null，否则抛出传入的异常</p>
     *
     * @param collection 断言集合
     * @param msg        错误消息
     */
    public static void notEmpty(Collection<?> collection, String msg) {
        if (CollectionUtils.isEmpty(collection)) {
            throw new BusinessException(msg);
        }
    }

    /**
     * <p>断言集合不为空或null，否则抛出传入的异常</p>
     *
     * @param collection 断言集合
     * @param msgformat  错误消息(可格式化)
     * @param formatArgs 格式化参数
     * @see java.util.Formatter
     */
    public static void notEmpty(Collection<?> collection, String msgformat,
                                Object... formatArgs) {
        notEmpty(collection, String.format(msgformat, formatArgs));
    }

    /**
     * <p>断言对象非null，否则抛出传入的异常</p>
     *
     * @param object 断言对象
     * @param msg    错误消息
     */
    public static void notNull(Object object, String msg) {
        if (object == null) {
            throw new BusinessException(msg);
        }
    }

    /**
     * <p>断言对象非null，否则抛出传入的异常</p>
     *
     * @param object 断言对象
     * @param msgformat  错误消息(可格式化)
     * @param formatArgs 格式化参数
     * @see java.util.Formatter
     */
    public static void notNull(Object object, String msgformat,
                               Object... formatArgs) {
        notNull(object, String.format(msgformat, formatArgs));
    }

    /**
     * <p>断言对象为null，否则抛出传入的异常</p>
     *
     * @param object     断言对象
     * @param msgformat  错误消息(可格式化)
     * @param formatArgs 格式化参数
     * @see java.util.Formatter
     */
    public static void isNull(Object object, String msgformat,
                              Object... formatArgs) {
        if (object != null) {
            throw new BusinessException(String.format(msgformat, formatArgs));
        }
    }

    /**
     * <p>断言对象必须为真，否则抛出传入的异常</p>
     *
     * @param conf 断言条件
     * @param msg  错误消息
     */
    public static void isTrue(boolean conf, String msg) {
        if (!conf) {
            throw new BusinessException(msg);
        }
    }

    /**
     * <p>断言对象必须为真，否则抛出传入的异常</p>
     *
     * @param conf 断言条件
     * @param msgformat  错误消息(可格式化)
     * @param formatArgs 格式化参数
     * @see java.util.Formatter
     */
    public static void isTrue(boolean conf, String msgformat,
                              Object... formatArgs) {
        isTrue(conf, String.format(msgformat, formatArgs));
    }

    /**
     * <p>断言两个对象相同，否则抛出传入的异常。</p>
     *
     * @param first      对象1
     * @param second     对象2
     * @param msgformat  错误消息(可格式化)
     * @param formatArgs 格式化参数
     * @see java.util.Formatter
     */
    public static void equals(Object first, Object second, String msgformat,
                              Object... formatArgs) {
        if (null == first) {
            isNull(second, msgformat, formatArgs);
            return;
        }

        if (!first.equals(second)) {
            throw new BusinessException(String.format(msgformat, formatArgs));
        }
    }

}
