package com.programs.FuelConsumption;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double fuelInLiters = 0, fuelInGallons, distanceInMiles, distanceInKMS = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no of liters to fill the tank");
        fuelInLiters = sc.nextInt();
        if (fuelInLiters <= 0 ) {
            System.out.println((int) (fuelInLiters) + " is an invalid input");
            return;
        }
        fuelInGallons = fuelInLiters * 0.2642;

        System.out.println("Enter the distance covered");
        distanceInKMS = sc.nextDouble();
        if (distanceInKMS <= 0) {
            System.out.println((int) (distanceInKMS) + " is an invalid input");
            return;
        }
        distanceInMiles = distanceInKMS * 0.6214;


        double fuelConsumptionInUS = ((fuelInLiters / distanceInKMS) * 100);
        double fuelConsumptionInEurope = ((distanceInMiles / fuelInGallons));

        System.out.println("Liters/100KM");
        System.out.printf("%.2f \n", (fuelConsumptionInUS));

        System.out.println("Miles/gallons");
        System.out.printf("%.2f", (fuelConsumptionInEurope));

    }
}
