package com.example.spring5jokesappv2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:chuck-config.xml")
public class Spring5JokesAppV2Application {

    public static void main(String[] args) {
        SpringApplication.run(Spring5JokesAppV2Application.class, args);
    }

}
