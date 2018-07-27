package com.timo.springschdule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 启动这个主类就可以在控制台上看到定时任务执行的结果了
 */
//启动定时任务
@EnableScheduling
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication
public class SpringSchduleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSchduleApplication.class, args);
	}
}
