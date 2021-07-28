package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class IocSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(IocSpringApplication.class, args);
		
		ApplicationContext context = ApplicationContextProvider.getContext();
		Base64Encoder base64encoder = context.getBean(Base64Encoder.class);
		Encoder encoder = new Encoder(base64encoder);
		String url = "www.naver,com/books/it?page=10&size=206&name=spring-boot";
	}

}
