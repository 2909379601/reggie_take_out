package com.errui.test;

import org.junit.jupiter.api.Test;

/**
 * @Author: Erruihhh
 * @Date: 2022/4/21
 * @Time: 23:27
 * @PROJECT_NAME: reggie_take_out
 * @Description:
 */
public class UploadFileTest {

    @Test
    public void uploadTest() {
        String fileName = "errui.jpg";
        String sufixx = fileName.substring(fileName.lastIndexOf("."));
        System.out.println(sufixx);
    }
}