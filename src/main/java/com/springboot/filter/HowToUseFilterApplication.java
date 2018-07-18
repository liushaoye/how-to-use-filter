package com.springboot.filter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan(basePackages = "com.springboot.filter.myfilter")
public class HowToUseFilterApplication {

	public static void main(String[] args) {
		SpringApplication.run(HowToUseFilterApplication.class, args);
	}
}
