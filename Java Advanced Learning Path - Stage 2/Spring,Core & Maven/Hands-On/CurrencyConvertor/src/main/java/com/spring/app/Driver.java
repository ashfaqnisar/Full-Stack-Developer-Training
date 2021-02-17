package com.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("appContext.xml");
        CurrencyConverter currencyConvertor = appContext.getBean("currencyConvertor", CurrencyConverter.class);

//        System.out.println(currencyConvertor.mObj.toString());
        System.out.println(currencyConvertor.getTotalCurrencyValue("5Dollar"));

    }
}
