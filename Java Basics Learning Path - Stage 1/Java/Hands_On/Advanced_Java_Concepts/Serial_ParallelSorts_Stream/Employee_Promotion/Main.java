package Hands_On.Advanced_Java_Concepts.Serial_ParallelSorts_Stream.Employee_Promotion;
/*Remove the package import from the code in genc learn*/

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of employees");
        int numberOfEmployees = sc.nextInt();

        String[] employeeInfo = new String[numberOfEmployees];
        List<Employee> employeeList = new ArrayList<>();
        System.out.println("Enter the employee details");
        for (int i = 0; i < numberOfEmployees; i++) {
            employeeInfo[i] = sc.next();
            String[] employeeInputArray = employeeInfo[i].split(":");
            Employee employee = new Employee(employeeInputArray[0], employeeInputArray[1], Double.parseDouble(employeeInputArray[2]));
            employeeList.add(employee);
        }

        System.out.println("Enter the number of times salary limit to be searched");
        int limit = sc.nextInt();
        String[] salaryCount = new String[limit];
        for (int i = 0; i < limit; i++) {
            System.out.println("Enter the salary limit to be searched");
            double salaryLimit = sc.nextDouble();
            Management management = new Management(salaryLimit, employeeList);
            management.run();
            int managementCount = management.getCount();
            DecimalFormat decimalFormat = new DecimalFormat("#.0");
            String formattedSalary = decimalFormat.format(salaryLimit);
            salaryCount[i] = formattedSalary + ":" + managementCount;
        }

        for (String s : salaryCount) {
            System.out.println(s);
        }
    }
}
