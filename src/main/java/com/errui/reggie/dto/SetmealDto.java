package com.errui.reggie.dto;

import com.errui.reggie.entity.Setmeal;
import com.errui.reggie.entity.SetmealDish;
import lombok.Data;

import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}