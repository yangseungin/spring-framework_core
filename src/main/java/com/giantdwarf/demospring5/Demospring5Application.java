package com.giantdwarf.demospring5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demospring5Application {

    public static void main(String[] args) {
        //이건 스프링 , 서버모드가 아닌상태로 띄우는방법
        SpringApplication app = new SpringApplication(Demospring5Application.class);
        app.setWebApplicationType(WebApplicationType.NONE);
        app.run(args);

        //SpringApplication.run(Demospring5Application.class, args);
    }


}
