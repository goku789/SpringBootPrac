package com.demo.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {
    private final MyFirstClass myFirstClass;
    public MyFirstService(
            @Qualifier("bean2") MyFirstClass myFirstClass) {
        this.myFirstClass = myFirstClass;
    }



    public String teelSetory(){
        return "The Dependenct is saying "+myFirstClass.sayHello();
    }
}
