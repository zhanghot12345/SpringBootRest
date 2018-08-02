//package com.zhangmy.SpringBootRest;
//
//import com.zhangmy.SpringBootRest.Schedule.MyDetailQuartzJobBean;
//import com.zhangmy.SpringBootRest.Schedule.MyScheduleTask;
//import com.zhangmy.SpringBootRest.web.SchedulerFactoryBeanConfig;
//import org.quartz.Trigger;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.scheduling.quartz.CronTriggerFactoryBean;
//import org.springframework.scheduling.quartz.JobDetailFactoryBean;
//import org.springframework.scheduling.quartz.SchedulerFactoryBean;
//
//import javax.sql.DataSource;
//
//@Configuration
//public class QuartzConfiguration {
//
//    @Qualifier("dataSource")
//    @Autowired
//    private DataSource dataSource;
//
//    @Autowired
//    private SchedulerFactoryBeanConfig schedulerFactoryBeanConfig;
//
//    @Bean(name = "jobDetail")
//    public JobDetailFactoryBean detailFactoryBean(MyScheduleTask myScheduleTask)
//    {
//        JobDetailFactoryBean jobDetail = new JobDetailFactoryBean();
//        jobDetail.set
//        jobDetail.setTargetObject("myScheduleTask");
//        jobDetail.setConcurrent(false);
//        jobDetail.setTargetMethod("executeInternal");
//        jobDetail.setGroup("mySchedule_group");
//        return jobDetail;
//    }
//
//    @Bean(name = "cronTriggerFactoryBean")
//    public CronTriggerFactoryBean cronTriggerBean(MyDetailQuartzJobBean jobDetail){
//        CronTriggerFactoryBean cronTriggerFactoryBean = new CronTriggerFactoryBean ();
//        cronTriggerFactoryBean.setJobDetail (jobDetail.getObject());
//        cronTriggerFactoryBean.setCronExpression ("0/5 * * * * ? ");//每5秒执行一次
//        cronTriggerFactoryBean.setName("myTrigger");
//        return cronTriggerFactoryBean;
//
//    }
//
//    @Bean(name = "scheduler")
//    public SchedulerFactoryBean schedulerFactory(Trigger cronJobTrigger){
//        SchedulerFactoryBean bean = new SchedulerFactoryBean ();
//        bean.setOverwriteExistingJobs(true);
//        bean.setStartupDelay(5);
//        bean.setAutoStartup(true);
//        bean.setDataSource(dataSource);
//        bean.setQuartzProperties(schedulerFactoryBeanConfig.quartzProperties());
//        bean.setApplicationContextSchedulerContextKey("applicationContext");
//        bean.setTriggers(cronJobTrigger);
//        return bean;
//    }
//
//}
