package com.errui.reggie.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.errui.reggie.common.CustomException;
import com.errui.reggie.entity.Category;
import com.errui.reggie.entity.Dish;
import com.errui.reggie.entity.Setmeal;
import com.errui.reggie.mapper.CategoryMapper;
import com.errui.reggie.service.CategoryService;
import com.errui.reggie.service.DishService;
import com.errui.reggie.service.SetmealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: Erruihhh
 * @Date: 2022/4/13
 * @Time: 23:01
 * @PROJECT_NAME: reggie_take_out
 * @Description:
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

    @Autowired
    private DishService dishService;

    @Autowired
    private SetmealService setmealService;

    /**
     * @Description: 根据id删除分类，删除之前需要进行判断
     * @Date: 2022/4/21
     * @Time: 14:48
     * @Author: Erruihhh
     * @Return:
     */
    @Override

    public void remove(long ids) {
        LambdaQueryWrapper<Dish> dishLambdaQueryWrapper = new LambdaQueryWrapper<>();
        //添加查询条件，根据分类id进行查询
        dishLambdaQueryWrapper.eq(Dish::getCategoryId, ids);
        int dishCount = dishService.count(dishLambdaQueryWrapper);
        //查询当前分类是否关联了菜品，如果已经关联，抛出一个业务异常
        if (dishCount > 0) {
            //已经关联菜品，抛出业务异常
            throw new CustomException("当前分类下关联了菜品，不能删除");
        }
        //查询当前分类是否关联了套餐，如果已经关联，抛出一个业务异常
        LambdaQueryWrapper<Setmeal> setmealLambdaQueryWrapper = new LambdaQueryWrapper<>();
        setmealLambdaQueryWrapper.eq(Setmeal::getCategoryId, ids);
        int setmealCount = setmealService.count(setmealLambdaQueryWrapper);
        if (setmealCount > 0) {
            //已经关联套餐，抛出业务异常
            throw new CustomException("当前分类下关联了套餐，不能删除");
        }
        super.removeById(ids);
        //正常输出分类
    }
}