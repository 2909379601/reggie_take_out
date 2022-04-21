package com.errui.reggie.common;

/**
 * @Description: 自定义业务异常类
 * @Date: 2022/4/21
 * @Time: 15:52
 * @Author: Erruihhh
 * @Return:
 */
public class CustomException extends RuntimeException {
    public CustomException(String message) {
        super(message);
    }
}