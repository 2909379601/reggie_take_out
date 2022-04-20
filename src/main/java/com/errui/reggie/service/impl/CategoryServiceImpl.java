package com.errui.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.errui.reggie.entity.Category;
import com.errui.reggie.mapper.CategoryMapper;
import com.errui.reggie.service.CategoryService;
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
}