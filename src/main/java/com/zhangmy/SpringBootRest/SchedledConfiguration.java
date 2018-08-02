package com.zhangmy.SpringBootRest;

import com.zhangmy.SpringBootRest.Schedule.MyScheduleTask;
import org.quartz.Trigger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.CronTriggerFactoryBean;
import org.springframework.scheduling.quartz.MethodInvokingJobDetailFactoryBean;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;


@Configuration
public class SchedledConfiguration {


    @Bean(name = "jobDetail")
    public MethodInvokingJobDetailFactoryBean detailFactoryBean(MyScheduleTask myScheduleTask)
    {
        MethodInvokingJobDetailFactoryBean jobDetail = new MethodInvokingJobDetailFactoryBean();
        jobDetail.setTargetObject(myScheduleTask);
        jobDetail.setConcurrent(false);
        jobDetail.setTargetMethod("mySchedule");
        jobDetail.setGroup("mySchedule_group");
        return jobDetail;
    }

    @Bean(name = "cronTriggerFactoryBean")
    public CronTriggerFactoryBean cronTriggerBean(MethodInvokingJobDetailFactoryBean jobDetail){
        CronTriggerFactoryBean cronTriggerFactoryBean = new CronTriggerFactoryBean ();
        cronTriggerFactoryBean.setJobDetail (jobDetail.getObject ());
        cronTriggerFactoryBean.setCronExpression ("0/5 * * * * ? ");//每5秒执行一次
        cronTriggerFactoryBean.setName("myTrigger");
        return cronTriggerFactoryBean;

    }

    @Bean(name = "scheduler")
    public SchedulerFactoryBean schedulerFactory(Trigger cronJobTrigger){
        SchedulerFactoryBean bean = new SchedulerFactoryBean ();
        bean.setOverwriteExistingJobs(true);
        bean.setStartupDelay(5);
        bean.setAutoStartup(true);
        //bean.setDataSource(dataSource);
        bean.setTriggers(cronJobTrigger);
        return bean;
    }
}
