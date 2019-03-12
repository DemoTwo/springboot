package com.cjp.springboot.Controller;

import com.cjp.springboot.Service.orderServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


@RestController
public class orderController {
    @Autowired
    private orderServiceInterface orderServiceInterface;

    @GetMapping("/boot/getallorder1")
    public Object getAllOrder1(){
        //线程 该线程调用底层查询所有订单的方法
        Runnable runnable =new Runnable() {
            @Override
            public void run() {
                //orderServiceInterface.getAllOrder1();
                orderServiceInterface.getAllOrder3();
            }
        };

        // 多线程测试一下缓存穿透问题
        ExecutorService executorService = Executors.newFixedThreadPool(25);
        for (int i=0;i<10000;i++){
            executorService.submit(runnable);
        }

        return orderServiceInterface.getAllOrder1();
    }
}
