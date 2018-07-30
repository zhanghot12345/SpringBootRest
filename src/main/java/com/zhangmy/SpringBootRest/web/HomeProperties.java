package com.zhangmy.SpringBootRest.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HomeProperties {

    @Value("${home.province}")
    private String province;

    @Value("${home.city}")
    private String city;

    @Value("${home.desc}")
    private String desc;

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString()
    {
        return desc;
    }
}
