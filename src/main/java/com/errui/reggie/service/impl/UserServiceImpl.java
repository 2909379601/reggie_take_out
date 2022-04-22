package com.errui.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.errui.reggie.entity.User;
import com.errui.reggie.mapper.UserMapper;
import com.errui.reggie.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @Author: Erruihhh
 * @Date: 2022/4/22
 * @Time: 20:34
 * @PROJECT_NAME: reggie_take_out
 * @Description:
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}