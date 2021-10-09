package org.javaboy.ioc.javaconfig;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import javax.xml.ws.Service;


/**
    java配置类，作用类似于applicationContext.xml
 **/
@Configuration
@ComponentScan(basePackages = "org.javaboy.ioc.service",useDefaultFilters = false,includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,classes = Service.class)})
public class JavaConfig {
    @Bean("he")
    SayHello sayHello(){
        return new SayHello();
    }

}
