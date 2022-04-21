package com.errui.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.errui.reggie.entity.Dish;
import com.errui.reggie.mapper.DishMapper;
import com.errui.reggie.service.DishService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @Author: Erruihhh
 * @Date: 2022/4/21
 * @Time: 14:40
 * @PROJECT_NAME: reggie_take_out
 * @Description:
 */
@Slf4j
@Service
public class DishServiceImpl extends ServiceImpl<DishMapper, Dish> implements DishService {
}