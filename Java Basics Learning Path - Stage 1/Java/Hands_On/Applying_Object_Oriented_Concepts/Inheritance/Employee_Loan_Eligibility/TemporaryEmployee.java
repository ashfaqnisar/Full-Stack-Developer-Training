package Hands_On.Applying_Object_Oriented_Concepts.Inheritance.Employee_Loan_Eligibility;
/*Remove the package import from the code in genc learn*/

public class TemporaryEmployee extends Employee {

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
