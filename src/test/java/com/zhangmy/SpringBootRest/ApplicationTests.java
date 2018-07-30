package com.zhangmy.SpringBootRest;

import com.zhangmy.SpringBootRest.web.MyProperties;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.junit.Assert;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest()
public class ApplicationTests {

    @Autowired
    private MyProperties myProperties;


    @Test
    public void getHello() throws Exception {
        Assert.assertEquals(myProperties.getName(), "bianzhengdong");
    }
}
