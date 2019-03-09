package com.cjp.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//@SpringBootApplication注解，表示这是springboot程序
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
//        这个方法是启动自己application.class 这个类，这样他就能启动springboot程序，然后启动spring容器，然后启动内嵌的Tomcat
        SpringApplication.run(Application.class, args);
    }

}
