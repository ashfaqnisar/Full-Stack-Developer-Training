package com.cts.EBanking;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        // CODE SKELETON - VALIDATION STARTS
        // DO NOT CHANGE THIS CODE

        new SkeletonValidator();

        // CODE SKELETON - VALIDATION ENDS

        ApplicationContext appContext = new ClassPathXmlApplicationContext("spring.xml");
        SmartBankAccount bankAccount = appContext.getBean("smartBankAccount", SmartBankAccount.class);

        // Please start your code from here
        //Configuration and Input data read here
        //Refer sample input details

        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.00");

        System.out.println("Welcome Mr/Ms: " + bankAccount.getName());
        System.out.println("Your customer id is :" + bankAccount.getCustomerId());
        System.out.println("Please select account type");
        System.out.println("1 CurrentAccount");
        System.out.println("2 RecurringAccount");
        System.out.println("3 FixedAccount");

        switch (scanner.nextInt()) {
            case 1:
                System.out.println("Select transaction type \n 1.Deposit \n 2.Withdraw");
                int choice = scanner.nextInt();
                if (choice == 1) {
                    System.out.println("Enter amount to be deposited");
                    double amount = scanner.nextDouble();

                    System.out.println("Your balance amount is " + decimalFormat.format(bankAccount.doDeposit(amount)));

                } else if (choice == 2) {
                    System.out.println("Enter amount to be withdrawn");
                    double amount = scanner.nextDouble();
                    bankAccount.doWithdraw(amount);
                    System.out.println("Your balance amount is " + decimalFormat.format(bankAccount.doWithdraw(amount)));
                } else {
                    System.out.println("Wrong choice");
                }
                break;
            case 2:
                System.out.println("Enter monthly installment");
                double monthlyInstallmentAmount = scanner.nextDouble();

                System.out.println("Enter tenure in months");
                int tenureForRecurringAmount = scanner.nextInt();

                double recurringAmount = bankAccount.calculateRecurringAccount(monthlyInstallmentAmount, tenureForRecurringAmount);

                System.out.println("Your balance after " + tenureForRecurringAmount + " months will be " + decimalFormat.format(recurringAmount));

                break;
            case 3:
                System.out.println("Enter FD amount");
                double amount = scanner.nextDouble();
                System.out.println("Enter tenure in months");
                int tenureForFixedAmount = scanner.nextInt();
                double fixedAmount = bankAccount.calculateFixedAccount(amount, tenureForFixedAmount);

                System.out.println("Your balance after " + tenureForFixedAmount + " months will be " + decimalFormat.format(fixedAmount));
                break;

            default:
                System.out.println("Wrong Choice");

        }

    }
}
