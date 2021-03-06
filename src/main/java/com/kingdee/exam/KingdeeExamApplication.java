package com.kingdee.exam;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@MapperScan({"com.kingdee.exam.dao","com.kingdee.exam.voj.mapper"})
public class KingdeeExamApplication{
	public static void main(String[] args) {
		SpringApplication.run(KingdeeExamApplication.class, args);
	}
}
