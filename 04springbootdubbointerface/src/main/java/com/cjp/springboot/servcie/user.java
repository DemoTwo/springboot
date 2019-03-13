package com.cjp.springboot.servcie;


import com.cjp.springboot.model.User;

public interface user {
    public String SayHello(String name);

    public User getUser(int id);
}
