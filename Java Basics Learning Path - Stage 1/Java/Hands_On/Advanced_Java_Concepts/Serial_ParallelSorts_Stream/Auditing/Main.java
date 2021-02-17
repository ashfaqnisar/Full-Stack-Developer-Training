package Hands_On.Advanced_Java_Concepts.Serial_ParallelSorts_Stream.Auditing;
/*Remove the package import from the code in genc learn*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Map<String, Double> employeeMap = new HashMap<>();

    public static EmployeeAudit findEmployee() {
        return salary -> {
            ArrayList<String> list = new ArrayList<>();
            employeeMap.forEach((key, value) -> {
                if (value <= salary) {
                    list.add(key);
                }
            });

            return list;
        };
    }

    public static void printMenu() {
        System.out.println("1. Add Employee details");
        System.out.println("2. Find Employee details");
        System.out.println("3. Exit");
        System.out.println("Enter the choice");
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        printMenu();
        int input = sc.nextInt();
        do {
            switch (input) {
                case 1:
                    System.out.println("Enter the Employee Name");
                    String employeeName = sc.next();
                    System.out.println("Enter the Employee Salary");
                    double employeeSalary = sc.nextDouble();
                    main.addEmployeeDetails(employeeName, employeeSalary);
                    break;
                case 2:
                    System.out.println("Enter the salary to be searched");
                    double inputSalary = sc.nextDouble();
                    EmployeeAudit employeeAudit = findEmployee();
                    ArrayList<String> namesList = employeeAudit.fetchEmployeeDetails(inputSalary);
                    if (namesList.isEmpty()) {
                        System.out.println("No Employee found");
                    } else {
                        System.out.println("Employee List");
                        for (String name : namesList) {
                            System.out.println(name);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Let's complete the session");
                    break;

                default:
                    break;
            }

            printMenu();
            input = sc.nextInt();
            if (input == 3) {
                System.out.println("Let's complete the session");
                break;
            }

        } while (input != 3);
    }

    public Map<String, Double> getEmployeeMap() {
        return employeeMap;
    }

    public void setEmployeeMap(Map<String, Double> employeeMap) {
        Main.employeeMap = employeeMap;
    }

    public void addEmployeeDetails(String employeeName, double salary) {
        employeeMap.put(employeeName, salary);
    }
}
