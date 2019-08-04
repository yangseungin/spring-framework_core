package com.giantdwarf.demospring5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.nio.file.Files;
import java.nio.file.Path;

@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    ApplicationContext resourceLoader;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(resourceLoader.getClass());


        Resource resource = resourceLoader.getResource("classpath:test.txt");
        //Resource resource2 = resourceLoader.getResource("test.txt"); // 스프링 부트기반의 어플리케이션을 작성하는 경우 classpath기준으로 많은 리소스를 씀 (classpath접두어를 사용하는것을 추천)

        System.out.println(resource.getClass());

        System.out.println(resource.exists());
        System.out.println(resource.getFile());
        System.out.println(resource.getDescription());
        System.out.println(Files.readString(Path.of(resource.getURI()))); //readString 은 자바11버전에 등장한녀석
    }
}
