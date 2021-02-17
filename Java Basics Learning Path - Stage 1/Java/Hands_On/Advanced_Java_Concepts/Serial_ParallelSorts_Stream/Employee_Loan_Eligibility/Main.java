package Hands_On.Advanced_Java_Concepts.Serial_ParallelSorts_Stream.Employee_Loan_Eligibility;
/*Remove the package import from the code in genc learn*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        EmployeeUtility employeeUtility = new EmployeeUtility();

        System.out.println("Enter the number of Employees");
        int numberOfEmployees = sc.nextInt();

        /*For fake input*/
        sc.nextLine();
        if (numberOfEmployees > 0) {
            System.out.println("Enter the details of Employees");
            String[] details = new String[numberOfEmployees];

            for (int i = 0; i < numberOfEmployees; i++) {
                details[i] = sc.nextLine();
            }

            System.out.println("Enter the minimum eligible salary");
            double minSalary = sc.nextDouble();

            String[] shortlistedEmployees = employeeUtility.shortlistedEmployee(employeeUtility.getStreamOfEmployee(employeeUtility.getEmployeeDetails(details)), minSalary);
            if (shortlistedEmployees.length > 0) {
                System.out.println("Shortlisted Employees are");
                for (String employee : shortlistedEmployees) {
                    System.out.println(employee);
                }
            } else {
                System.out.println("No Employee is having the required salary");
            }
        } else {
            System.out.println("Invalid Input");
        }
    }
}
