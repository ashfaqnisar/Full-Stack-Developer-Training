package Hands_On.Applying_Object_Oriented_Concepts.Inheritance.Contact_Details_Of_Hosteller;
/*Remove the package import from the code in genc learn*/

import java.util.Scanner;

public class Main {

    public static Hosteller getHostellerDetails() {
        Scanner sc = new Scanner(System.in);
        Hosteller newHosteller = new Hosteller();

        System.out.println("Enter the details:");
        System.out.println("Student Id");
        newHosteller.setStudentId(sc.nextInt());

        System.out.println("Student Name");
        newHosteller.setName(sc.next());

        System.out.println("Department Id");
        newHosteller.setDepartmentId(sc.nextInt());

        System.out.println("Gender");
        newHosteller.setGender(sc.next());

        System.out.println("Phone Number");
        newHosteller.setPhone(sc.next());

        System.out.println("Hostel Name");
        newHosteller.setHostelName(sc.next());

        System.out.println("Room Number");
        newHosteller.setRoomNumber(sc.nextInt());

        System.out.println("Modify Room Number(Y/N)");
        if (sc.next().equals("Y")) {
            System.out.println("New Room Number");
            newHosteller.setRoomNumber(sc.nextInt());
        }

        System.out.println("Modify Phone Number(Y/N)");
        if (sc.next().equals("Y")) {
            System.out.println("New Phone Number");
            newHosteller.setPhone(sc.next());
        }

        return newHosteller;
    }

    public static void main(String[] args) {
        Hosteller hosteller = getHostellerDetails();
        System.out.println(hosteller.toString());
    }
}
