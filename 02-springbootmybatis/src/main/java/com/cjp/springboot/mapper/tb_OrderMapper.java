package com.cjp.springboot.mapper;

import com.cjp.springboot.model.tb_Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

//在mybatis的Mapper接口中添加@Mapper注解，否则无法变成spring的一个bean
@Mapper
public interface tb_OrderMapper {
//    int deleteByPrimaryKey(Long orderId);
//
//    int insert(tb_Order record);
//
//    int insertSelective(tb_Order record);
//
//    tb_Order selectByPrimaryKey(Long orderId);
//
//    int updateByPrimaryKeySelective(tb_Order record);
//
//    int updateByPrimaryKey(tb_Order record);

    List<tb_Order> getAllOrder();
}