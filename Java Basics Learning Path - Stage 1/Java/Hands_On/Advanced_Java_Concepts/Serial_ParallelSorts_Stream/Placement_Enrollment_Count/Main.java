package Hands_On.Advanced_Java_Concepts.Serial_ParallelSorts_Stream.Placement_Enrollment_Count;
/*Remove the package import from the code in genc learn*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter all roll numbers separated by comma");
        String name = sc.nextLine();
        Stream<String> s = getRollNumbers(name);

        System.out.println("Enter the department name acronym");
        String dept = sc.next();

        int count = getCount(s, dept);
        if (count == 0) {
            System.out.println("No students from " + dept);
        } else {
            System.out.println("Number of students in me is " + count);

        }

    }

    public static Stream<String> getRollNumbers(String rollNumbers) {
        String[] x = rollNumbers.split(",");
        return Arrays.stream(x);
    }

    public static int getCount(Stream<String> rollNumberStream, String department) {
        ArrayList<Integer> list = new ArrayList<>();
        rollNumberStream.forEach(rollNumber -> {
            if (rollNumber.toLowerCase().contains(department.toLowerCase())) {
                list.add(1);
            }
        });
        return list.size();

    }

}
