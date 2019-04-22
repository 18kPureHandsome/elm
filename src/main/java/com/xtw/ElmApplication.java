package com.xtw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class ElmApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElmApplication.class, args);
	}

}
