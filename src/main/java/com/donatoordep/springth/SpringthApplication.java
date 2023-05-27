package com.donatoordep.springth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.donatoordep.springth.entities")
public class SpringthApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringthApplication.class, args);
	}

}
