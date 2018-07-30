package com.zhangmy.SpringBootRest.service.serviceImpl;

import com.zhangmy.SpringBootRest.dao.mapper.CityMapper;
import com.zhangmy.SpringBootRest.entity.domain.City;
import com.zhangmy.SpringBootRest.service.CityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.concurrent.TimeUnit;


@Service
public class CityServiceImpl implements CityService{

    private static Logger logger = LoggerFactory.getLogger(CityServiceImpl.class);

    @Autowired
    private CityMapper cityMapper;

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public City getCityById(Integer id) {
        City city = cityMapper.selectByPrimaryKey(id);
        return city;
    }

    public City findCityByid(Integer id)
    {
        City city;
        String key = "city_" + id;
        ValueOperations<String, City> valueOperations = redisTemplate.opsForValue();
        if (redisTemplate.hasKey(key))
        {
            city = valueOperations.get(key);
            logger.info("find key from redis");
            return city;
        }

        city = cityMapper.selectByPrimaryKey(id);

        if (city != null)
        {
            valueOperations.set(key, city, 100, TimeUnit.SECONDS);
            logger.info("find key from mysql && insert into redis");
        }

        return city;
    }

    @Transactional
    public int addCuty()
    {
        int result;
        City t = new City();
        t.setCityName("北京");
        t.setDescription("我家在北京");
        t.setProvinceId(2);
        result = cityMapper.insert(t);


        City t1 = new City();
        t1.setCityName("南京");
        t1.setDescription("我家在南京");
        t1.setProvinceId(3);

        result  = result & cityMapper.insert(t1);
        return result;
    }
}
