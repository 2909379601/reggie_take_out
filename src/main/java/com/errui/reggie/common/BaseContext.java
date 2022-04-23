package com.errui.reggie.common;

/**
 * @Author: Erruihhh
 * @Date: 2022/4/19
 * @Time: 13:00
 * @PROJECT_NAME: reggie_take_out
 * @Description:
 */
public class BaseContext {
    private static ThreadLocal<Long> threadLocal = new ThreadLocal<>();

    /**
     * 设置值
     */
    public static void setCurrentId(Long id) {
        threadLocal.set(id);
    }

    /**
     * 获取值
     */
    public static Long getCurrentId() {
        return threadLocal.get();
    }
}