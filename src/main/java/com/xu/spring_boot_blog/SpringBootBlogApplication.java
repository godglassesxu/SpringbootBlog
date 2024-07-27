package com.xu.spring_boot_blog;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.modelmapper.ModelMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@OpenAPIDefinition(
        info = @Info(
                title = "BLOG APIs",
                description = "APIs Documentation",
                version = "v1.0",
                contact = @Contact(
                        name = "guest",
                        email = "guest@gmail.com",
                        url = "https://www.guest.net"
                ),
                license = @License(
                        name = "Apache 2.0",
                        url = "https://www.guest.net"
                )
        )
)
public class SpringBootBlogApplication {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootBlogApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(String[] args) {
        return runner -> {
            System.out.println("Server START");
        };
    }

}
