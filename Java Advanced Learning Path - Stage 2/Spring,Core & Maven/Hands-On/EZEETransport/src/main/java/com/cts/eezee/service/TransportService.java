package com.cts.eezee.service;

import com.cts.eezee.model.Booking;
import com.cts.eezee.model.Vehicle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Locale;

public class TransportService {
    private Vehicle vehicle;

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void registerBooking(Booking booking) throws ParseException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Customer Name");
        booking.setCustomerName(reader.readLine());

        System.out.println("Enter the Mobile Number");
        booking.setMobileNumber(Long.parseLong(reader.readLine()));

        System.out.println("Enter the Destination");
        booking.setDestination(reader.readLine());

        System.out.println("Enter the Date of Journey <dd-MM-yyy>");
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        booking.setDateOfJourney(dateFormat.parse(reader.readLine()));

        calculateTravelCost(vehicle.getSource(), booking.getDestination(), booking.getDateOfJourney());
    }

    public void calculateTravelCost(String source, String destination, Date doj) {
        if (checkAvailableDateForTravel(doj)) {
            System.out.printf("Total Travel Cost is Rs. %.1f", getCost(destination));
        } else {
            System.out.println("Invalid Travel Date");
        }
    }

    public boolean checkAvailableDateForTravel(Date doj) {
//        *This will get the date in this manner, (2021-02-09)
        LocalDate dateOfJourney = doj.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate currentDate = LocalDateTime.now().toLocalDate();

        return dateOfJourney.compareTo(currentDate) >= 0;
    }

    public double getCost(String destination) {
        if (vehicle.getDestinationMap().containsKey(destination)) {
            return (vehicle.getDestinationMap().get(destination));
        }
        return 0.0;
    }

}
