package com.errui.reggie.controller;

import com.errui.reggie.common.R;
import com.errui.reggie.dto.DishDto;
import com.errui.reggie.service.DishFlavorService;
import com.errui.reggie.service.DishService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Erruihhh
 * @Date: 2022/4/21
 * @Time: 23:55
 * @PROJECT_NAME: reggie_take_out
 * @Description:
 */
@Slf4j
@RestController
@RequestMapping("/dish")
public class DishController {

    @Autowired
    private DishService dishService;

    @Autowired
    private DishFlavorService dishFlavorService;

    /**
     * @Description: 新增菜品
     * @Date: 2022/4/22
     * @Time: 9:10
     * @Author: Erruihhh
     * @Return:
     */
    @PostMapping
    public R<String> save(@RequestBody DishDto dishDto) {
        log.info(dishDto.toString());

        dishService.saveWithFlavor(dishDto);

        return R.success("新增菜品成功");
    }
}