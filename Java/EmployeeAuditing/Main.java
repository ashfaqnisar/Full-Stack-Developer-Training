package EmployeeAuditing;

import java.util.*;

public class Main {

    private static Map<String, Double> employeeMap;

    public Map<String, Double> getEmployeeMap() {
        return employeeMap;
    }

    public void setEmployeeMap(Map<String, Double> employeeMap) {
        Main.employeeMap = employeeMap;
    }

    public void addEmployeeDetails(String employeeName, double salary) {
        employeeMap.put(employeeName, salary);
    }


    public static EmployeeAudit findEmployee() {
        return (double salary) -> {
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
        employeeMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int input;
        printMenu();
        input = sc.nextInt();
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
                    double inputSalary = sc.nextDouble();
                    EmployeeAudit sampleAudit = findEmployee();
                    ArrayList<String> names = sampleAudit.fetchEmployeeDetails(inputSalary);
                    if (names.isEmpty()) {
                        System.out.println("No Employee Found");
                    } else {
                        for (String name : names) {
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
}
