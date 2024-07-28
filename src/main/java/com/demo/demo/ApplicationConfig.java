package com.demo.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ApplicationConfig {

    @Bean
    @Qualifier("bean1")
    public MyFirstClass myfirstbeam()
    {
        return new MyFirstClass("qwertyuioiuyhgfdsdfg");
    }


    @Bean
    @Qualifier("bean2")
    public MyFirstClass mySeconfClass()
    {
        return new MyFirstClass("mySecond Bean");
    }

    @Bean
    @Qualifier("bean3")
    public MyFirstClass myThirdClass()
    {
        return new MyFirstClass("myThird Bean");
    }
}
