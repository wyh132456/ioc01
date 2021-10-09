package org.javaboy.ioc;

import org.javaboy.ioc.javaconfig.JavaConfig;
import org.javaboy.ioc.javaconfig.SayHello;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
        SayHello sayHello = ctx.getBean("sayHello",SayHello.class);
        System.out.println(sayHello.sayHello("allboy"));
    }

}
