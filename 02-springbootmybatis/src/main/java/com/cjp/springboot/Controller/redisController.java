package com.cjp.springboot.Controller;

import com.cjp.springboot.Service.OrderSertvice;
import com.cjp.springboot.model.tb_Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class redisController {

    @Autowired
    private OrderSertvice orderSertvice;

    @GetMapping("/boot/redis")
    public Object redis(){
      return   orderSertvice.TestRedis();
    }
}
