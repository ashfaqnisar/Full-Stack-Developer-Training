package Hands_On.Advanced_Java_Concepts.Serial_ParallelSorts_Stream.Employee_Loan_Eligibility;
/*Remove the package import from the code in genc learn*/

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeUtility {

    public Employee[] getEmployeeDetails(String[] details) {

        Employee[] employeeList = new Employee[details.length];

        for (int i = 0; i < details.length; i++) {
            String[] x = details[i].split(";");
            Employee employee = new Employee();
            employee.setEmpId(x[0]);
            employee.setEmpName(x[1]);
            employee.setSalary(Double.parseDouble(x[2]));
            employeeList[i] = employee;

        }

        return employeeList;
    }

    public Stream<Employee> getStreamOfEmployee(Employee[] empDetails) {
        return Arrays.stream(empDetails);
    }

    public String[] shortlistedEmployee(Stream<Employee> empStream, double minSalary) {

        ArrayList<String> name = new ArrayList<>();

        empStream.forEach(employee ->
        {
            if (employee.getSalary() >= minSalary) {
                DecimalFormat decimalFormat = new DecimalFormat("#.0");
                String sal = decimalFormat.format(employee.getSalary());
                name.add(employee.getEmpId() + " " + employee.getEmpName() + " " + sal);
            }
        });

        String[] x = new String[name.size()];
        for (int i = 0; i < x.length; i++) {
            x[i] = name.get(i);
        }
        Arrays.sort(x);
        return x;
    }

}
