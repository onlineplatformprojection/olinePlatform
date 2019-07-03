package com.example.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Demo2Application extends SpringBootServletInitializer {
	//启动类添加 Servlet 的支持
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Demo2Application.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class, args);
	}

}
