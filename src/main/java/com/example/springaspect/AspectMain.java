package com.example.springaspect;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AspectMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext contextPnamespace =
        new ClassPathXmlApplicationContext("META-INF/spring/ApplicationContext.xml");
    }
}
