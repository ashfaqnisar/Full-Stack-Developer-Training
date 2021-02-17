package Hands_On.Applying_Object_Oriented_Concepts.Inheritance.Employee_Loan_Eligibility;
/*Remove the package import from the code in genc learn*/

public class Loan {

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
