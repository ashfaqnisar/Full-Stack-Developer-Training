package com.programs.StudentMain;

import java.util.Arrays;
import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        int studentId;
        String studentName, studentAddress, collegeName;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter com.programs.StudentMain.Student's Id:");
        studentId = sc.nextInt();

        System.out.println("Enter com.programs.StudentMain.Student's Name:");
        studentName = sc.nextLine();

        System.out.println("Enter com.programs.StudentMain.Student's Address:");
        studentAddress = sc.nextLine();

        System.out.println("Whether the student is from NIT(Yes/No):");
        String fromNit = sc.nextLine();

        while (!Arrays.asList("yes", "Yes", "no", "NO").contains(fromNit)) {
            System.out.println("Wrong Input");
            System.out.println("Whether the student is from NIT(Yes/No):");
            fromNit = sc.nextLine();
        }

        if (Arrays.asList("yes", "Yes").contains(fromNit)) {
            Student student = new Student(studentId, studentName, studentAddress);
            student.toString();
            return;
        }

        System.out.println("Enter the college name:");
        collegeName = sc.nextLine();

        Student student = new Student(studentId, studentName, studentAddress, collegeName);
        student.toString();
    }
}
