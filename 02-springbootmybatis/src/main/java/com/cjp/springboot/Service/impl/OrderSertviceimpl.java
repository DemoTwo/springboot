package com.cjp.springboot.Service.impl;

import com.cjp.springboot.Service.OrderSertvice;
import com.cjp.springboot.mapper.tb_OrderMapper;
import com.cjp.springboot.model.tb_Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
//不要忘记加上service注解
@Service
public class OrderSertviceimpl implements OrderSertvice {

    @Autowired
    private tb_OrderMapper orderMapper;// 这里的orderMapper会爆红，这是idea的问题，不用管，或者将其改成警告即可

    @Override
    public List<tb_Order> getAllOrder() {
        return orderMapper.getAllOrder();
    }
//    @Transactional
    @Override
    public int update() {
       tb_Order order =new tb_Order();
       order.setOrderId((long) 1);
       order.setReceiverAreaName("金燕办公-update");
       int update=orderMapper.updateByPrimaryKey(order);
       System.out.println(update);

       // 因为除数不能为0，所以会有异常，所以上一步会回滚
        int a =10/0;
        return  update;

    }
}
