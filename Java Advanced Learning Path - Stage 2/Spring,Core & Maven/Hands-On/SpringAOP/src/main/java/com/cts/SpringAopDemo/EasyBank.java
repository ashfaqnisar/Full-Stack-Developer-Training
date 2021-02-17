package com.cts.SpringAopDemo;

import org.springframework.stereotype.Component;

@Component
public class EasyBank {

    private int pinCode = 6789;
    private int balance = 10000;
    private int tempPin;

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getTempPin() {
        return tempPin;
    }

    public void setTempPin(int tempPin) {
        this.tempPin = tempPin;
    }

    public void doDeposit(int amount) {
        balance += amount;
        System.out.println("Your  balance is " + balance);
        // Type your code here
    }

    public void doWithdraw(int amount) {
        if (amount >= 0 && amount < balance) {
            balance -= amount;
            System.out.println("You have successfully withdrawn " + amount);
        } else {
            System.out.println("Insufficient Fund");
        }
    }

    public void doChangePin(int oldPin, int pin) {
        String REGEX = "[0][0-9]{3}$";
        if (oldPin == pinCode || String.valueOf(pin).matches(REGEX)) {
            pinCode = pin;
        } else {
            System.out.println("Invalid Pin");
        }
    }

    public void showBalance() {
        System.out.println("Your balance is " + balance);
    }

}
