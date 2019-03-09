package com.cjp.springboot.controller;

import com.cjp.springboot.config.ConfigInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ConfigInfoController {
//    1。用@Value注解读取，用于逐个读取自定义的配置
    @Value("${boot.name}")
    private String name;

    @Value("${boot.location}")
    private String location;

//    2/用ConfigurationProperties注解的方式
        @Autowired
        private ConfigInfo configInfo;


    @RequestMapping("/boot/config")
    public @ResponseBody String Config(){
        return name+ "_______"+location + "=====" +configInfo.getName()+"------"+configInfo.getLocation();
    }



}
