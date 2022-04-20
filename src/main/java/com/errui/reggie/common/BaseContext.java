package com.errui.reggie.common;

/**
 * @Author: Erruihhh
 * @Date: 2022/4/19
 * @Time: 13:00
 * @PROJECT_NAME: reggie_take_out
 * @Description:
 */
public class BaseContext {
    public static ThreadLocal<Long> threadLocal = new ThreadLocal<>();

    /**
     * 设置值
     *
     * @param id
     */
    public static void setCurrentId(Long id) {
        threadLocal.set(id);
    }

    /**
     * 获取值
     *
     * @return threadLocal
     */
    public static Long getCurrentId() {
        return threadLocal.get();
    }
}