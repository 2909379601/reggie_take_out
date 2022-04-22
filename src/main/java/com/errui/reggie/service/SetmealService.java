package com.errui.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.errui.reggie.dto.SetmealDto;
import com.errui.reggie.entity.Setmeal;

import java.util.List;

/**
 * @Author: Erruihhh
 * @Date: 2022/4/21
 * @Time: 14:39
 * @PROJECT_NAME: reggie_take_out
 * @Description:
 */
public interface SetmealService extends IService<Setmeal> {

    /**
     * 新增套餐，同时需要保存套餐和商品的依赖关系
     */
    void saveWithDish(SetmealDto setmealDto);

    /**
     * 删除套餐，同时需要删除套餐和菜品的关联数据
     */
    void removeWithDish(List<Long> ids);
}