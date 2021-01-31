package com.didongbabong;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.didongbabong.mapper")
public class DidongbabongApplication {

	public static void main(String[] args) {
		SpringApplication.run(DidongbabongApplication.class, args);
	}

}
