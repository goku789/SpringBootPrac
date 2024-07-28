package com.demo.demo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


public class MyFirstClass {
    public MyFirstClass(String myvar) {
        this.myvar = myvar;
    }

    public String myvar;
    public String sayHello(){
        return "This is my first variable "+myvar;
    }
}
