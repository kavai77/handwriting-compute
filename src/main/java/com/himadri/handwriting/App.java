package com.himadri.handwriting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:/secrets.yml")
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
