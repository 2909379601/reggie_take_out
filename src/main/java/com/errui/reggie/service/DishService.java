package com.errui.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.errui.reggie.dto.DishDto;
import com.errui.reggie.entity.Dish;

/**
 * @Author: Erruihhh
 * @Date: 2022/4/13
 * @Time: 23:00
 * @PROJECT_NAME: reggie_take_out
 * @Description:
 */
public interface DishService extends IService<Dish> {
    /**
     * @Description: 新增菜品，同时插入菜品对应的口味数据，需要操作两张表：dish,dishFlavor
     * @Author: Erruihhh
     * @Date: 2022/4/22
     * @Time: 10:59
     * @Return:
     */
    void saveWithFlavor(DishDto dishDto);

    /**
     * @Description: 根据id查询菜品信息和对应的口味信息
     * @Author: Erruihhh
     * @Date: 2022/4/22
     * @Time: 13:29
     * @Return:
     */
    DishDto getByIdWithFlavor(Long id);

    /**
     * @Description: 更新菜品信息，同时更新口味信息
     * @Author: Erruihhh
     * @Date: 2022/4/22
     * @Time: 13:54
     * @Return:
     */
    void updateWithFlavor(DishDto dishDto);
}