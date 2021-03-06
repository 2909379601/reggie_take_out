package com.errui.reggie.utils;

import java.security.SecureRandom;


/**
 * @Description: 随机生成验证码工具类
 * @Author: Erruihhh
 * @Date: 2022/4/22
 * @Time: 20:41
 * @Return:
 */
public class ValidateCodeUtils {

    /**
     * @Description: 随机生成验证码
     * @Author: Erruihhh
     * @Date: 2022/4/22
     * @Time: 20:43
     * @Return: code
     */
    public static Integer generateValidateCode(int length) {
        Integer code = null;
        if (length == 4) {
            //生成随机数，最大为9999
            code = new SecureRandom().nextInt(9999);
            if (code < 1000) {
                //保证随机数为4位数字
                code = code + 1000;
            }
        } else if (length == 6) {
            //生成随机数，最大为999999
            code = new SecureRandom().nextInt(999999);
            if (code < 100000) {
                //保证随机数为6位数字
                code = code + 100000;
            }
        } else {
            throw new RuntimeException("只能生成4位或6位数字验证码");
        }
        return code;
    }

    /**
     * @Description: 随机生成指定长度字符串验证码
     * @Author: Erruihhh
     * @Date: 2022/4/22
     * @Time: 20:43
     * @Return: capstr
     */
    public static String generateValidateCode4String(int length) {
        SecureRandom secureRandom = new SecureRandom();
        String hash1 = Integer.toHexString(secureRandom.nextInt());
        String capStr = hash1.substring(0, length);
        return capStr;
    }
}