package com.cjp.springboot.Service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.cjp.springboot.model.User;
import com.cjp.springboot.servcie.user;
import org.springframework.stereotype.Component;


@Service(timeout = 10000,interfaceClass = user.class) //引入dubbo 服务，timeout 为10秒
@Component
public class UserServiceimpl implements user {

    @Override
    public String SayHello(String name) {
        return "Hi ,springboot" + name;
    }

    @Override
    public User getUser(int id) {

        // 查询数据库，为了简单，我们不再链接数据库

        User user=new User();
        user.setId(id);
        user.setName("cjp");
        user.setPhone("123456789");;
        return user;
    }
}
