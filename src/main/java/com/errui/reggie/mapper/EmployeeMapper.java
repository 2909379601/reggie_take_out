package com.errui.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.errui.reggie.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: Erruihhh
 * @Date: 2022/4/13
 * @Time: 22:59
 * @PROJECT_NAME: reggie_take_out
 * @Description:
 */
@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {
}