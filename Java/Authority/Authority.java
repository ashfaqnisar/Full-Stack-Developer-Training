package Authority;

import java.util.Scanner;

public class Authority {
    static String USER_REGEX = "[a-zA-z ]*";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Inmate's name:");
        String inmatesName = sc.nextLine();
        System.out.print("\n");

        System.out.print("Inmate's father's name:");
        String inmatesFatherName = sc.nextLine();
        System.out.print("\n");

        if (!inmatesName.matches(USER_REGEX) || !inmatesFatherName.matches(USER_REGEX)) {
            System.out.println("Invalid name");
            return;
        }

        System.out.println(inmatesName.toUpperCase().concat(" " + inmatesFatherName.toUpperCase()));
    }
}
