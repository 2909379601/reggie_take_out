package com.errui.reggie;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @Author: Erruihhh
 * @Date: 2022/4/13
 * @Time: 22:09
 * @PROJECT_NAME: reggie_take_out
 * @Description:
 */
@Slf4j
@ServletComponentScan
@SpringBootApplication
public class ReggieApplication {
    public static void main(String[] args) {
        SpringApplication.run(ReggieApplication.class, args);
        log.info("项目启动成功...");
    }
}