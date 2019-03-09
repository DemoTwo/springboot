package com.cjp.springboot.mapper;

import com.cjp.springboot.model.tb_Order;

public interface tb_OrderMapper {
    int deleteByPrimaryKey(Long orderId);

    int insert(tb_Order record);

    int insertSelective(tb_Order record);

    tb_Order selectByPrimaryKey(Long orderId);

    int updateByPrimaryKeySelective(tb_Order record);

    int updateByPrimaryKey(tb_Order record);
}