package com.cjp.springboot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

//ConfigurationProperties 注解，并且用prefix配置前缀，因为我们在配置文件中的名字为boot.name,为此前缀为boot
@Component
@ConfigurationProperties(prefix = "boot")
public class ConfigInfo {
    private String name;
    private String location;// 属性的名字必须和配置文件的自定义的名字一样，这样才能映射

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
