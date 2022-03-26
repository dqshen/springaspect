package com.example.springaspect;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class ConcertConfig {
    
    // 注意切面需要在配置类或者xml配置文件额外声明成bean，而不像一般Acappella这样的Component那样通过ComponentScan就可以进入上下文
    @Bean
    public Audience audience(){
        return new Audience();
    }

    // 和切面一样，introducation引入语法需要在配置类或者xml配置文件额外声明成bean，仅靠@ComponentScan是不能让引入生效的
    @Bean
    public EncoreableIntroducer introducer(){
        return new EncoreableIntroducer();
    }
    
    @Bean 
    public Performance performance(){
        Acappella performance = new Acappella();
        performance.setName("Power");
        return performance;
    }
}
