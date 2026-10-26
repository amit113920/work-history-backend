package com.ak.work.history.work_history;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableCaching
@EntityScan(basePackages = "com.ak.work.history.work_history.entity")
@ComponentScan(basePackages = "com.ak.work.history.work_history")
public class WorkHistoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkHistoryApplication.class, args);
	}

}
