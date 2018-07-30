package com.zhangmy.SpringBootRest.web;

import com.zhangmy.SpringBootRest.entity.domain.City;
import com.zhangmy.SpringBootRest.service.CityService;
import com.zhangmy.SpringBootRest.test;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import net.sf.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    private static Logger logger = LoggerFactory.getLogger(RestController.class);

    @Autowired
    private HomeProperties hp;

    @Autowired
    private CityService cityService;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String index()
    {
        return "Hello World";
    }

    @RequestMapping(value = "/findCity", method = RequestMethod.GET)
    public JSONObject findCtiyById(@RequestParam Integer id)
    {
        JSONObject object = new JSONObject();
        City city = cityService.findCityByid(id);
        if (city != null)
        {
            object.put(city.getCityName(), city.getDescription());
        }
        return object;
    }

    @RequestMapping(value = "/getCity", method = RequestMethod.GET)
    public String getCity()
    {
        City c = cityService.getCityById(1);
        return c == null ? "查不到数据" : c.getDescription();
    }

    @RequestMapping(value = "/addCity" , method = RequestMethod.GET)
    public int addCity()
    {
        return cityService.addCuty();
    }

    @RequestMapping(value = "/hello1", method = RequestMethod.GET)
    public String index1()
    {
        logger.info("111");
        MyProperties mp = new MyProperties();
        logger.debug(mp.getName());
        logger.debug(hp.getProvince());
        logger.debug(hp.getCity());
        logger.debug(hp.getDesc());
        return hp.getDesc();
    }

    @ApiOperation(value = "sha1加密", notes = "传入需要加密的值，sha1加密后返回")
    @ApiImplicitParam(name = "body", value = "需要加密的键值对", required = true, dataType = "Stirng")
    @RequestMapping(value = "/getSha1", method = RequestMethod.POST)
    public JSONObject getSwaggerPostTest(@RequestBody String body)
    {
        JSONObject obj = JSONObject.fromObject(body);
        if (body.contains("key"))
        {
            String sha1Value = test.encode(obj.get("key").toString());
            obj.put("key",sha1Value);
        }
        return obj;
    }
}
