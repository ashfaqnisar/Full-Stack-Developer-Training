package com.cts.eezee;

import com.cts.eezee.model.Booking;
import com.cts.eezee.service.TransportService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException, IOException {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("bean.xml");
        TransportService transportService = appContext.getBean("transportService", TransportService.class);
        Booking booking = appContext.getBean("booking", Booking.class);

        transportService.registerBooking(booking);
    }
}
