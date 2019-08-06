package com.giantdwarf.demospring5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class ProxySimpleEventService implements EventService {
    //프록시를 또 생성해줘야하며 여기서도 중복코드가 발생한
    //이를 깔끔하게 해결하는게 springaop

    @Autowired
    SimpleEventService simpleEventService;


    @Override
    public void createEvent() {
        Long begin = System.currentTimeMillis();
        simpleEventService.createEvent();
        System.out.println(System.currentTimeMillis()-begin);
    }

    @Override
    public void publishEvent() {
        Long begin = System.currentTimeMillis();
        simpleEventService.publishEvent();
        System.out.println(System.currentTimeMillis()-begin);
    }

    @Override
    public void deleteEvent() {
        simpleEventService.deleteEvent();
    }
}
