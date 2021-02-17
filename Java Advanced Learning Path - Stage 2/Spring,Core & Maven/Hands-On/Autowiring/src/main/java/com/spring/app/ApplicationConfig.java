package com.spring.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

@Configuration
@ComponentScan
public class ApplicationConfig {
    @Bean(name = "passport")
    public Passport getPassport() {
        Passport passport = new Passport();
        passport.setDateOfExpiry(new Date());
        passport.setDateOfIssue(new Date());
        passport.setPassNum(123456);
        return passport;
    }

    @Bean(name = "employee")
    public Employee getEmployee() {
        Employee employee = new Employee();
        employee.setEmpId(12);
        employee.setEmpName("Ashfaq");
        return employee;
    }
}
