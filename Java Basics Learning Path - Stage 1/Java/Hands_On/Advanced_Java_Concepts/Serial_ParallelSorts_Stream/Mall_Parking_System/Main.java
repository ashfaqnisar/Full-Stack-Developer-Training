package Hands_On.Advanced_Java_Concepts.Serial_ParallelSorts_Stream.Mall_Parking_System;
/*Remove the package import from the code in genc learn*/

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("In-time");

        String inputInTime = sc.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime now = LocalDateTime.parse("29/10/2019 20:10", formatter);

        try {
            LocalDateTime inTime = LocalDateTime.parse(inputInTime, formatter);
            long difference = ChronoUnit.MINUTES.between(inTime, now);
            if (difference >= 1) {
                System.out.println("Out-Time");
                String inputOutTime = sc.nextLine();

                try {
                    LocalDateTime outTime = LocalDateTime.parse(inputOutTime, formatter);
                    long actualDifference = ChronoUnit.MINUTES.between(inTime, outTime);
                    if (actualDifference >= 1) {
                        int hr;
                        if (actualDifference % 60 == 0) {
                            hr = (int) actualDifference / 60;
                        } else {
                            hr = 1 + (int) actualDifference / 60;
                        }
                        System.out.println(hr * 10 + " Rupees");
                    } else {
                        System.out.println(inputOutTime + " is an Invalid Out-Time");
                    }
                } catch (DateTimeParseException e) {
                    System.out.println(inputOutTime + " is an Invalid Out-Time");
                }

            } else {
                System.out.println(inputInTime + " is an Invalid In-Time");
            }
        } catch (DateTimeParseException e) {
            System.out.println(inputInTime + " is an Invalid In-Time");
        }
    }
}
