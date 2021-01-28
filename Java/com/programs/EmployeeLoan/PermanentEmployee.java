package com.programs.EmployeeLoan;

public class PermanentEmployee extends Employee {
    private double basicPay;

    public PermanentEmployee(int employeeId) {
        super(employeeId);
    }

    public PermanentEmployee(int employeeId, String employeeName) {
        super(employeeId, employeeName);
    }

    public PermanentEmployee(int employeeId, String employeeName, double basicPay) {
        super(employeeId, employeeName);
        this.basicPay = basicPay;
    }

    public PermanentEmployee(int employeeId, String employeeName, double salary, double basicPay) {
        super(employeeId, employeeName, salary);
        this.basicPay = basicPay;
    }

    // Getters and Setters

    public double getBasicPay() {
        return basicPay;
    }

    public void setBasicPay(double basicPay) {
        this.basicPay = basicPay;
    }

    //1. Write a public 3 argument constructor with arguments – employeeId, employeeName and basicPay.


    //2. Implement the  - public void calculateSalary() - method
    public void calculateSalary() {
        double pfAmount = (basicPay * 0.12);
        setSalary(basicPay - pfAmount);
    }

}
