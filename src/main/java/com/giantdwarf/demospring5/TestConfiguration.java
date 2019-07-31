package com.giantdwarf.demospring5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test") // 이 빈 설정파일은 Test프로파일일떄만 사용되는 설정파일이 됨
public class TestConfiguration {


    @Bean
    public BookRepository bookRepository(){
        return new TestBookRepository();
    }
}
