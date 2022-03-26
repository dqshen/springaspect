package com.example.springaspect;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AspectMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "META-INF/spring/ApplicationContext.xml");
        Performance performance = context.getBean(Performance.class);
        Encoreable encoreable = (Encoreable) performance;
        encoreable.performEncore();
        context.close();
    }
}
