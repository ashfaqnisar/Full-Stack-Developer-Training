package Candidate;

import java.util.Scanner;

public class Main {
    public static Candidate getCandidateDetails() throws InvalidSalaryException {
        Scanner sc = new Scanner(System.in);
        Candidate candidate = new Candidate();
        System.out.println("Enter the candidate Details");

        System.out.println("Name");
        candidate.setName(sc.nextLine());

        System.out.println("Gender");
        candidate.setGender(sc.nextLine());

        System.out.println("Expected Salary");
        int salary = sc.nextInt();
        if (salary < 10000) {
            throw new InvalidSalaryException("Registration Failed. Salary cannot be less than 10000.");
        }
        candidate.setExpectedSalary(salary);
        System.out.println("Registration Successful");
        return candidate;
    }

    public static void main(String[] args) throws InvalidSalaryException {
        getCandidateDetails();
    }
}
