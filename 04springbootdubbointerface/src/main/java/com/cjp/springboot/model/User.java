package com.cjp.springboot.model;

import java.io.Serializable;

public class User implements Serializable {
    private int id;
    private  String name;
    private  String phone;
// alt +insert调用方法 自动生成get set方法
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
