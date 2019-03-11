package com.cjp.springboot.Service;

import com.cjp.springboot.model.tb_Order;

import java.util.List;

public interface OrderSertvice {
    List<tb_Order> getAllOrder();

    public int update();

    public List<tb_Order> TestRedis();
}
