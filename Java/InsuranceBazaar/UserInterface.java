package InsuranceBazaar;
//package com.ui;
//import com.utility.*;

import java.util.*;

public class UserInterface {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        Bazaar bazaar = new Bazaar();


        System.out.println("Enter the no of Policy names you want to store");
        int numberOfPolicies = sc.nextInt();

        /*Treemap is used for sorting the data in sorted manner*/
        TreeMap<Integer, String> map = new TreeMap<Integer, String>();
        bazaar.setPolicyMap(map);

        for (int i = 0; i < numberOfPolicies; i++) {

            System.out.println("Enter the Policy ID");
            int policyNumber = sc.nextInt();
            /*Need to make this dummy call*/
            sc.nextLine();
            System.out.println("Enter the Policy Name");
            String policyName = sc.nextLine();

            bazaar.addPolicyDetails(policyNumber, policyName);
        }

        // using for-each loop for iteration over Map.entrySet()
        for (Map.Entry<Integer, String> entry : bazaar.getPolicyMap().entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println("Enter the policy type to be searched");
        for (int policyNumber : bazaar.searchBasedOnPolicyType(sc.next())) {
            System.out.println(policyNumber);
        }

    }

}
