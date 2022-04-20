package com.errui.reggie.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.errui.reggie.entity.Category;
import org.apache.ibatis.annotations.Mapper;


/**
 * @Author: Erruihhh
 * @Date: 2022/4/19
 * @Time: 14:35
 * @PROJECT_NAME: reggie_take_out
 * @Description:
 */
@Mapper
public interface CategoryMapper extends BaseMapper<Category> {
}