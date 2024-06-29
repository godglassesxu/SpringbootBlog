package com.xu.spring_boot_blog;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootBlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBlogApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(String[] args){
		return  runner ->{
			System.out.println("hello world");
		};
	}

}
