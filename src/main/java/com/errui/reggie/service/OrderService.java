package com.errui.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.errui.reggie.entity.Orders;

public interface OrderService extends IService<Orders> {

    /**
     * 用户下单
     */
    void submit(Orders orders);
}