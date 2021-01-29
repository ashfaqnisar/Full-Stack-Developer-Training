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
        EmployeeAudit audit = (double salary) -> {
            ArrayList<String> list = new ArrayList<>();
            employeeMap.forEach((key, value) -> {
                if (value <= salary) {
                    list.add(key);
                }
            });
            if (list.isEmpty()) {
                System.out.println("No Employee Found");
            } else {
                for (String name : list) {
                    System.out.println(name);
                }
            }
            return list;
        };
        return audit;
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
                    EmployeeAudit sampleAudit = Main.findEmployee();
                    sampleAudit.fetchEmployeeDetails(inputSalary);
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
