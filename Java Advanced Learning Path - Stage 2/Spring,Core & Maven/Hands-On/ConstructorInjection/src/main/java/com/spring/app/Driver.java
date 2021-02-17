package com.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
/*
        Customer customer = getCustomerValues();
*/
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        MemberShip memberShip = applicationContext.getBean("membership", MemberShip.class);

        System.out.println(memberShip.toString());
    }

    private static Customer getCustomerValues() {
        Scanner sc = new Scanner(System.in);
        Customer customer = new Customer();
        System.out.println("Cust Id");
        customer.setCustId(sc.nextInt());
        System.out.println("Cust Name");
        customer.setCustName(sc.next());
        System.out.println("Cust Email");
        customer.setEmailId(sc.next());
        System.out.println("Cust Number");
        customer.setContactNo(sc.nextLong());
        return customer;
    }
}
