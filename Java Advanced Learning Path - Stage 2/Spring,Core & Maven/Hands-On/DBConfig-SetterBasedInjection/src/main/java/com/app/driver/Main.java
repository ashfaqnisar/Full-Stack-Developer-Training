package com.app.driver;

import com.spring.app.DBConfig;
import com.spring.app.EmployeeDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    @SuppressWarnings("resource")
    public static void main(String[] args) {

        ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");
        EmployeeDAO employeeDAO = appContext.getBean("employeeDao",EmployeeDAO.class);
        DBConfig dbConfig = employeeDAO.getDbConfig();
        System.out.println(dbConfig.getDriverName());
        System.out.println(dbConfig.getUrl());
        System.out.println(dbConfig.getUserName());
        System.out.println(dbConfig.getPassword());

    }
}
