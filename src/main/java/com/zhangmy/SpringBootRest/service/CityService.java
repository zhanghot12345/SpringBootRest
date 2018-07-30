package com.zhangmy.SpringBootRest.service;

import com.zhangmy.SpringBootRest.entity.domain.City;

public interface CityService {
    public City getCityById(Integer id);

    public int addCuty();

    public City findCityByid(Integer id);
}
