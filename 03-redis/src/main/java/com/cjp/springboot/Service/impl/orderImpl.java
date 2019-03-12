package com.cjp.springboot.Service.impl;

import com.cjp.springboot.Service.orderServiceInterface;
import com.cjp.springboot.mapper.tb_OrderMapper;
import com.cjp.springboot.model.tb_Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class orderImpl implements orderServiceInterface {

    @Autowired
    private tb_OrderMapper orderMapper;

    @Autowired
    private RedisTemplate<Object,Object> redisTemplate;

    @Override
    public List<tb_Order> getAllOrder1() {
// 高并发条件下，此处有问题：缓存穿透问题
        // 查询缓存
        List<tb_Order> orderList= (List<tb_Order>) redisTemplate.opsForValue().get("AllOrder");

        if (null ==orderList){
            // 缓存为空，查询一遍数据库
            System.out.println("查询数据库------------");
            orderList= orderMapper.getAllOrder();
            redisTemplate.opsForValue().set("AllOrder",orderList);
        }else{
            System.out.println("查询redis缓存------------");
        }
        return orderList;
    }
//对方法进行加锁，但是这样的性能不是很高
    @Override
    public synchronized List<tb_Order> getAllOrder2() {
        List<tb_Order> orderList= (List<tb_Order>) redisTemplate.opsForValue().get("AllOrder");

        if (null ==orderList){
            // 缓存为空，查询一遍数据库
            System.out.println("查询数据库------------");
            orderList= orderMapper.getAllOrder();
            redisTemplate.opsForValue().set("AllOrder",orderList);
        }else{
            System.out.println("查询redis缓存------------");
        }
        return orderList;
    }
//加上双层检测锁
    @Override
    public List<tb_Order> getAllOrder3() {
        List<tb_Order> orderList= (List<tb_Order>) redisTemplate.opsForValue().get("AllOrder");

        // 双重检测锁
        if (null==orderList){
            synchronized (this){
                // 在redis中获取
                orderList= (List<tb_Order>) redisTemplate.opsForValue().get("AllOrder");
                if (null==orderList){
                    System.out.println("查询数据库------------");
                    orderList= orderMapper.getAllOrder();
                    redisTemplate.opsForValue().set("AllOrder",orderList);
                }else {
                    System.out.println("查询redis缓存------------");
                }
            }
        }else{
            System.out.println("查询redis缓存------------");
        }
        return orderList;
    }
}
