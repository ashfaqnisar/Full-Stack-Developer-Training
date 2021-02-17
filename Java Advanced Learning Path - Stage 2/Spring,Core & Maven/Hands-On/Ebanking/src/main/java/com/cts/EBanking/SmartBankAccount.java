package com.cts.EBanking;

import java.text.DecimalFormat;
import java.util.List;

public class SmartBankAccount extends BankAccount {

    private final DecimalFormat decimalFormat = new DecimalFormat("#.00");

    public SmartBankAccount() {
        super();
    }


    public SmartBankAccount(int customerId, String name, double balance, List<String> accounts) {
        super(customerId, name, balance, accounts);
    }

    @Override
    public double calculateFixedAccount(double amount, int months) {
        double interest = 0.1;
        if (amount > 9999 && amount < 1000001 && months < 121 && months > 0) {
            double onePlusRByNPowerNT = Math.pow(1 + (interest / 12), months);
            double result = amount * onePlusRByNPowerNT;
            return Double.parseDouble(decimalFormat.format(result));
        }
//        Need to send -1, if it the input is not correct
        return -1;
    }

    @Override
    public double calculateRecurringAccount(double amount, int months) {
        double interest = 0.07;
        if (amount > 999 && amount < 50001 && months < 61 && months > 0) {
            /*Need to have the 24 in the double format*/
            double result = (amount * months) + (amount * (months * (months + 1) / 24.0) * interest);
            return Double.parseDouble(decimalFormat.format(result));
        }
//        Need to send -1, if it the input is not correct
        return -1;
    }
}
