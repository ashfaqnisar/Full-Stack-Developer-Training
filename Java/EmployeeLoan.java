abstract class Employee {
    protected int employeeId;
    protected String employeeName;
    protected double salary;

    public Employee(int employeeId) {
        this.employeeId = employeeId;
    }

    public Employee(int employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    public Employee(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    //Getters and Setters
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract void calculateSalary();


    //Write a public 2 argument constructor with arguments – employeeId,and employeeName


    //Write a method -  public void calculateSalary()
    //Make this method as abstract

}

//Make this class inherit the Employee class

class PermanentEmployee extends Employee {
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

class TemporaryEmployee extends Employee {

    private int hoursWorked;
    private int hourlyWages;

    public TemporaryEmployee(int employeeId, int hoursWorked, int hourlyWages) {
        super(employeeId);
        this.hoursWorked = hoursWorked;
        this.hourlyWages = hourlyWages;
    }

    public TemporaryEmployee(int employeeId, String employeeName, int hoursWorked, int hourlyWages) {
        super(employeeId, employeeName);
        this.hoursWorked = hoursWorked;
        this.hourlyWages = hourlyWages;
    }

    public TemporaryEmployee(int employeeId, String employeeName, double salary, int hoursWorked, int hourlyWages) {
        super(employeeId, employeeName, salary);
        this.hoursWorked = hoursWorked;
        this.hourlyWages = hourlyWages;
    }

    // Getters and Setters

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public int getHourlyWages() {
        return hourlyWages;
    }

    public void setHourlyWages(int hourlyWages) {
        this.hourlyWages = hourlyWages;
    }


    //2. Implement the  - public void calculateSalary() - method
    public void calculateSalary() {
        double salary = (hoursWorked * hourlyWages);
        setSalary(salary);
    }
}

class Loan {

    //Implement the below method

    public double calculateLoanAmount(Employee employeeObj) {
        double loanAmount = 0;
        if (employeeObj instanceof PermanentEmployee) {
            loanAmount = 0.15 * employeeObj.getSalary();

        } else {
            loanAmount = 0.1 * employeeObj.getSalary();
        }
        return loanAmount;
    }

}


public class EmployeeLoan {
    public static void main(String[] args) {

    }
}
