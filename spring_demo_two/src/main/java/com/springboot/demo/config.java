package com.springboot.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration //marks a class as source of bean. Multiple methods could be present and CAN return java bean.
//We dont need to manage Objects. spring container automatically manage them.

public class config
{
    @Bean //Works on method level. we can autowire this bean anywhere
    public Student student_Method()
    {
        return new Student();
    }

    public Emp emp_Method()
    {
        return new Emp();
    }
}
