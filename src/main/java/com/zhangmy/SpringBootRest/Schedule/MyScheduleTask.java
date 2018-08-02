package com.zhangmy.SpringBootRest.Schedule;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
@EnableScheduling
public class MyScheduleTask implements Serializable{

    private static final long serialVersionUID = 7113324009690613982L;

    public void mySchedule()
    {
        System.out.println("1");
    }


}
