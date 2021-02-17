package com.spring.ui;

import com.spring.app.Address;
import com.spring.app.AddressBook;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Driver {

    public static AddressBook loadAddressBook(){
        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        return appContext.getBean("addressBook", AddressBook.class);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        AddressBook addressBook = loadAddressBook();
        Address address = addressBook.getTempAddress();

        System.out.println("Enter the temporary address");
        System.out.println("Enter the house name");
        address.setHouseName(reader.readLine());

        System.out.println("Enter the street");
        address.setStreet(reader.readLine());
        System.out.println("Enter the city");
        address.setCity(reader.readLine());
        System.out.println("Enter the state");
        address.setState(reader.readLine());
        System.out.println("Enter the phone number");
        addressBook.setPhoneNumber(reader.readLine());

        System.out.println("Temporary address");
        System.out.println("House name:"+address.getHouseName());
        System.out.println("Street:"+address.getStreet());
        System.out.println("City:"+address.getCity());
        System.out.println("State:"+address.getState());
        System.out.println("Phone number:"+addressBook.getPhoneNumber());

    }
}
