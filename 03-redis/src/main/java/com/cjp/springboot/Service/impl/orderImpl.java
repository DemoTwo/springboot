package com.cjp.springboot.Service.impl;

import com.cjp.springboot.Service.orderServiceInterface;
import com.cjp.springboot.mapper.tb_OrderMapper;
import com.cjp.springboot.model.tb_Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class orderImpl implements orderServiceInterface {

    @Autowired
    private tb_OrderMapper orderMapper;

    @Override
    public List<tb_Order> getAllOrder() {
        return orderMapper.getAllOrder();
    }
}
