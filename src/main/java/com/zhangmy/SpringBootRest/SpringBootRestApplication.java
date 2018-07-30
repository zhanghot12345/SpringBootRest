package com.zhangmy.SpringBootRest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
@EnableScheduling
@MapperScan("com.zhangmy.SpringBootRest.dao.mapper")
public class SpringBootRestApplication //如果需要打war包需要打开extends SpringBootServletInitializer
{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestApplication.class, args);
	}
}
