package com.cjp.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//因为是通过controller控制器跳到jsp，为此我们不能使用@RestController
@Controller
public class JSPController {

    @GetMapping("boot/index")
    public String Index(Model model){
        // 在model中设置变量并设置值
        model.addAttribute("mes","spring boot 集成jsp");
        //返回到index.jsp 中
        return  "index";
    }
}
