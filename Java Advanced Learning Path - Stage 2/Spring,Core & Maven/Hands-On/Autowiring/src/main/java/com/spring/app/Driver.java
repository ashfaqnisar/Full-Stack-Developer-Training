package com.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
    public static void main(String[] args) {
        ApplicationContext appContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        Employee employee = appContext.getBean("employee", Employee.class);
        System.out.println(employee.toString());
    }

}
