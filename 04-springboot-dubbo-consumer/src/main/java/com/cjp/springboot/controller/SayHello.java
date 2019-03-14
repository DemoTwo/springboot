package com.cjp.springboot.controller;




import com.cjp.springboot.servcie.user;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayHello {
    @Reference
     private user user;
    @RequestMapping("/boot/getuser")
    public Object getuser(@RequestParam("id") Integer id){
        return user.getUser(id);
    }
}
