package com.demo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		var ctx=SpringApplication.run(DemoApplication.class, args);

		MyFirstService myFirstService  =ctx.getBean("myFirstClass",MyFirstService.class);
		System.out.println(myFirstService.teelSetory());
	}

}