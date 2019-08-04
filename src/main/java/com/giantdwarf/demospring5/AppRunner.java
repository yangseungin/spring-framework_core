package com.giantdwarf.demospring5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.util.Arrays;

@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    Validator validator;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(validator.getClass());

        Event event = new Event();
        event.setLimit(-1);
        event.setEmail("aaa2");

        Errors errors = new BeanPropertyBindingResult(event,"event"); // 스프링mvc에서 사용한다면 이값들은 자동으로 넘어가서 직접 구현할일은 없다.

        validator.validate(event,errors);

        System.out.println(errors.hasErrors());
        errors.getAllErrors().forEach(e ->{
            System.out.println("====== error code =====");
            Arrays.stream(e.getCodes()).forEach(System.out::println);
            System.out.println(e.getDefaultMessage());
        });
    }
}
