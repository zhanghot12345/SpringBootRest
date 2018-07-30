package com.zhangmy.SpringBootRest.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyProperties {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Value("${com.name}")
    private String name;
}
