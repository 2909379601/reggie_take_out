package com.errui.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.errui.reggie.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: Erruihhh
 * @Date: 2022/4/22
 * @Time: 20:33
 * @PROJECT_NAME: reggie_take_out
 * @Description:
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}