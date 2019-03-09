package com.cjp.springboot.Controller;

import com.cjp.springboot.Service.OrderSertvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mybaitsController {

    @Autowired
    private OrderSertvice orderSertvice;

    @GetMapping("/boot/Order")
    public  Object Order(){
        return orderSertvice.getAllOrder();
    }
}
