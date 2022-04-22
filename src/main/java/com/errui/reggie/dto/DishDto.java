package com.errui.reggie.dto;

import com.errui.reggie.entity.Dish;
import com.errui.reggie.entity.DishFlavor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Date: 2022/4/22
 * @Time: 8:46
 * @Author: Erruihhh
 * @Return:
 */
@Data
public class DishDto extends Dish {

    private List<DishFlavor> flavors = new ArrayList<>();

    private String categoryName;

    private Integer copies;
}