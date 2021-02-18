package com.cts.rainbowjewellers;

import com.cts.rainbowjewellers.service.RainbowJewellersService;
import com.cts.skeletonvalidator.SkeletonValidator;

import java.util.Scanner;


public class RainbowJewellers {

    public static void main(String[] args) {

        SkeletonValidator validator = new SkeletonValidator();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the gold in grams");
        double grams = Double.parseDouble(scanner.nextLine());
        RainbowJewellersService rainbowJewellersService = new RainbowJewellersService();
        double totalPriceOfGold = rainbowJewellersService.calculategoldprice(grams);
        System.out.println("Total Price of the Gold is: " + totalPriceOfGold);
    }

}
