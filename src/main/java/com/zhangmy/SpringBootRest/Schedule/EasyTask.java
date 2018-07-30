package com.zhangmy.SpringBootRest.Schedule;

import org.springframework.stereotype.Component;

@Component
public class EasyTask {

    //@Scheduled(cron = "0/1 * * * * ?")
    public void printCurrentTime()
    {
        System.out.println(System.currentTimeMillis());
    }

}
