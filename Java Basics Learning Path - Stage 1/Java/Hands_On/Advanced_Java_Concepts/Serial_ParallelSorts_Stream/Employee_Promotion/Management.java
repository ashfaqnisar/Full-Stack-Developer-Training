package Hands_On.Advanced_Java_Concepts.Serial_ParallelSorts_Stream.Employee_Promotion;
/*Remove the package import from the code in genc learn*/

import java.util.List;

public class Management {
    private double salaryLimit;
    private List<Employee> employeeList;
    private int count;

    public Management(double salaryLimit, List<Employee> employeeList) {
        super();
        this.salaryLimit = salaryLimit;
        this.employeeList = employeeList;
    }

    public double getSalaryLimit() {
        return salaryLimit;
    }

    public void setSalaryLimit(double salaryLimit) {
        this.salaryLimit = salaryLimit;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void run() {
        int count = 0;
        for (Employee employee : employeeList) {
            if (employee.getEmpSalary() >= salaryLimit) {
                count++;
            }
        }
        setCount(count);
        //Fill the code
    }
}
