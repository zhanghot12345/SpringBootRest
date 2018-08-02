//package com.zhangmy.SpringBootRest.Schedule;
//
//import org.quartz.JobExecutionContext;
//import org.quartz.JobExecutionException;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.ApplicationContext;
//import org.springframework.scheduling.quartz.QuartzJobBean;
//import org.springframework.stereotype.Component;
//
//import java.lang.reflect.Method;
//@Component
//public class MyDetailQuartzJobBean extends QuartzJobBean {
//    protected final Logger logger = LoggerFactory.getLogger(MyDetailQuartzJobBean.class);
//
//    private String targetObject;
//    private String targetMethod;
//
//    public Object getObject() {
//        return object;
//    }
//
//    private Object object;
//    @Autowired
//    private ApplicationContext ctx;
//    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
//        try {
//            logger.info("execute [" + targetObject + "] at once>>>>>>");
//            Object otargetObject = ctx.getBean(targetObject);
//            object = otargetObject;
//            Method m = null;
//            try {
//                m = otargetObject.getClass().getMethod(targetMethod, new Class[] {});
//                m.invoke(otargetObject, new Object[] {});
//            } catch (SecurityException e) {
//            } catch (NoSuchMethodException e) {
//            }
//        } catch (Exception e) {
//            throw new JobExecutionException(e);
//        }
//    }
//
////    public void setApplicationContext(ApplicationContext applicationContext){
////        this.ctx=applicationContext;
////    }
//
//    public void setTargetObject(String targetObject) {
//        this.targetObject = targetObject;
//    }
//
//    public void setTargetMethod(String targetMethod) {
//        this.targetMethod = targetMethod;
//    }
//
//}