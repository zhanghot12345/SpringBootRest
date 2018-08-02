//package com.zhangmy.SpringBootRest.web;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.stereotype.Component;
//
//import java.util.Properties;
//
//@Configuration
//@Component
//public class SchedulerFactoryBeanConfig {
//    @Value("${quartz.scheduler.instanceName}")
//    private String quartzInstanceName;
//
//    @Value("${org.quartz.dataSource.myDS.driver}")
//    private String myDSDriver;
//
//    @Value("${org.quartz.dataSource.myDS.URL}")
//    private String myDSURL;
//
//    @Value("${org.quartz.dataSource.myDS.user}")
//    private String myDSUser;
//
//    @Value("${org.quartz.dataSource.myDS.password}")
//    private String myDSPassword;
//
//    @Value("${org.quartz.dataSource.myDS.maxConnections}")
//    private String myDSMaxConnections;
//
//    @Value("${org.quartz.dataSource.myDs.validationQuery}")
//    private String myDSValidationQuery;
//
//    @Value("${org.quartz.threadPool.makeThreadsDaemons}")
//    private String makeThreadsDaemons;
//
//    @Value("${org.quartz.threadPool.threadCount}")
//    private String threadCount;
//
//    @Value("${org.quartz.threadPool.threadPriority}")
//    private String threadPriority;
//
//    @Value("${org.quartz.jobStore.class}")
//    private String jobStoreclass;
//
//    @Value("${org.quartz.jobStore.driverDelegateClass}")
//    private String driverDelegateClass;
//
//    @Value("${org.quartz.jobStore.tablePrefix}")
//    private String tablePrefix;
//
//    @Value("${org.quartz.jobStore.isClustered}")
//    private String isClustered;
//
//    @Value("${org.quartz.jobStore.dataSource}")
//    private String dataSource;
//
//    @Value("${org.quartz.jobStore.misfireThreshold}")
//    private String misfireThreshold;
//
//    @Value("${org.quartz.jobStore.clusterCheckinInterval}")
//    private String clusterCheckinInterval;
//
//    public Properties quartzProperties()
//    {
//        Properties prop = new Properties();
//        prop.put("quartz.scheduler.instanceName", quartzInstanceName);
//        prop.put("org.quartz.scheduler.instanceId", "AUTO");
//        prop.put("org.quartz.scheduler.skipUpdateCheck", "true");
//        prop.put("org.quartz.scheduler.jmx.export", "true");
//
//        prop.put("org.quartz.jobStore.class", jobStoreclass);
//        prop.put("org.quartz.jobStore.driverDelegateClass", driverDelegateClass);
//        prop.put("org.quartz.jobStore.dataSource", dataSource);
//        prop.put("org.quartz.jobStore.tablePrefix", tablePrefix);
//        prop.put("org.quartz.jobStore.isClustered", isClustered);
//
//        prop.put("org.quartz.jobStore.clusterCheckinInterval", clusterCheckinInterval);
//        prop.put("org.quartz.jobStore.maxMisfiresToHandleAtATime", "1");
//        prop.put("org.quartz.jobStore.misfireThreshold", "120000");
//        prop.put("org.quartz.jobStore.txIsolationLevelSerializable", "true");
//        prop.put("org.quartz.jobStore.selectWithLockSQL", "SELECT * FROM {0}LOCKS WHERE LOCK_NAME = ? FOR UPDATE");
//
//        prop.put("org.quartz.threadPool.class", "org.quartz.simpl.SimpleThreadPool");
//        prop.put("org.quartz.threadPool.threadCount", "10");
//        prop.put("org.quartz.threadPool.threadPriority", "5");
//        prop.put("org.quartz.threadPool.threadsInheritContextClassLoaderOfInitializingThread", "true");
//
//        prop.put("org.quartz.dataSource.myDS.driver", myDSDriver);
//        prop.put("org.quartz.dataSource.myDS.URL", myDSURL);
//        prop.put("org.quartz.dataSource.myDS.user", myDSUser);
//        prop.put("org.quartz.dataSource.myDS.password", myDSPassword);
//        prop.put("org.quartz.dataSource.myDS.maxConnections", 5);
//
//        prop.put("org.quartz.plugin.triggHistory.class", "org.quartz.plugins.history.LoggingJobHistoryPlugin");
//        prop.put("org.quartz.plugin.shutdownhook.class", "org.quartz.plugins.management.ShutdownHookPlugin");
//        prop.put("org.quartz.plugin.shutdownhook.cleanShutdown", "true");
//        return prop;
//    }
//
//
//}
