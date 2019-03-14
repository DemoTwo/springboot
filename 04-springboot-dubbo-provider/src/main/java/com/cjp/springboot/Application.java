package com.cjp.springboot;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@DubboComponentScan(basePackages = "com.cjp.springboot.Service.impl")
@SpringBootApplication
@EnableDubboConfiguration// 开启dubbo自动配置注解
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean("applicationBean")
    public ApplicationConfig applicationBean() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("04-springboot-dubbo-provider");
        return applicationConfig;
    }
}
