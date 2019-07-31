package com.giantdwarf.demospring5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:/app.properties")
public class Demospring5Application {

    public static void main(String[] args) {
        SpringApplication.run(Demospring5Application.class, args);
    }

}
