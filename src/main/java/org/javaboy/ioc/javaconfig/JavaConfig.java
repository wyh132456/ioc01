package org.javaboy.ioc.javaconfig;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
    java配置类，作用类似于applicationContext.xml
 **/
@Configuration
public class JavaConfig {
    @Bean
    SayHello sayHello(){
        return new SayHello();
    }

}
