package com.errui.reggie.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.errui.reggie.common.R;
import com.errui.reggie.entity.Category;
import com.errui.reggie.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: Erruihhh
 * @Date: 2022/4/19
 * @Time: 14:44
 * @PROJECT_NAME: reggie_take_out
 * @Description:
 */
@Slf4j
@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping
    public R<String> save(@RequestBody Category category) {
        log.info("category:{}", category);
        categoryService.save(category);
        return R.success("新增分类成功");
    }

    /**
     * @Description: 分页查询
     * @Date: 2022/4/19
     * @Time: 21:00
     * @Author: Erruihhh
     * @Return:
     */
    @GetMapping("/page")
    public R<Page> page(int page, int pageSize) {
        /**
         * 分页构造器
         */
        Page<Category> pageInfo = new Page<>(page, pageSize);
        /**
         * 条件构造器
         */
        LambdaQueryWrapper<Category> queryWrapper = new LambdaQueryWrapper<>();
        /**
         * 添加排序条件，根据sort进行排序
         */
        queryWrapper.orderByAsc(Category::getSort);
        /**
         * 进行分页查询
         */
        categoryService.page(pageInfo, queryWrapper);
        return R.success(pageInfo);
    }

}