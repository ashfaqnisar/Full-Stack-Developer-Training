package Hands_On.Advanced_Java_Concepts.Serial_ParallelSorts_Stream.Add_Flight_Using_JDBC;
/*Remove the package import from the code in genc learn*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int flightID = sc.nextInt();
        String source = sc.next();
        String destination = sc.next();
        int noOfSeats = sc.nextInt();
        double flightFare = sc.nextDouble();

        Flight flight = new Flight(flightID, source, destination, noOfSeats, flightFare);
        FlightManagementSystem flightManagementSystem = new FlightManagementSystem();

        if (flightManagementSystem.addFlight(flight))
            System.out.println("Flight details added successfully");
        else
            System.out.println("Addition not done");

    }
}
