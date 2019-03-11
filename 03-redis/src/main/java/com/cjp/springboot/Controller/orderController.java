package com.cjp.springboot.Controller;

import com.cjp.springboot.Service.orderServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class orderController {
    @Autowired
    private orderServiceInterface orderServiceInterface;

    @GetMapping("/boot/getallorder")
    public Object getAllOrder(){
        return orderServiceInterface.getAllOrder();
    }
}
