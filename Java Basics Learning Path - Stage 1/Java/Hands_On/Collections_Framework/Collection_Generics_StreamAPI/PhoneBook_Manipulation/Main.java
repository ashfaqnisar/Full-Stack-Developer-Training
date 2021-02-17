package Hands_On.Collections_Framework.Collection_Generics_StreamAPI.PhoneBook_Manipulation;
/*Remove the package import from the code in genc learn*/

import java.util.Scanner;

public class Main {

    public static PhoneBook phoneBook = new PhoneBook();

    public static void printMenu() {
        System.out.println("Menu");
        System.out.println("1.Add Contact");
        System.out.println("2.Display all contacts");
        System.out.println("3.Search contact by phone ");
        System.out.println("4.Remove contact");
        System.out.println("5.Exit");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        printMenu();
        System.out.print("Enter your choice: ");
        int input = in.nextInt();
        while (input != 5) {
            switch (input) {
                case 1:
                    createContact();
                    break;
                case 2:
                    displayAllContacts();
                    break;
                case 3:
                    getContactByPhone();
                    break;
                case 4:
                    removeContactFromPhoneBook();
                    break;
                default:
                    break;
            }
            System.out.print("Enter your choice: ");
            input = in.nextInt();
        }


        System.out.println("Menu");
    }

    public static void removeContactFromPhoneBook() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Phone number to remove:");
        long phoneNumber = sc.nextLong();
        System.out.print("Do you want to remove the contact (Y/N):");
        String decision = sc.next();
        if (decision.equals("Y")) {
            phoneBook.removeContact(phoneNumber);
            System.out.println("The contact is successfully deleted.");
        }

    }

    public static void createContact() {
        Scanner sc = new Scanner(System.in);
        Contact contact = new Contact();

        System.out.print("Enter the First Name:");
        contact.setFirstName(sc.next());

        System.out.print("Enter the Last Name:");
        contact.setLastName(sc.next());

        System.out.print("Enter the Phone No:");
        contact.setPhoneNumber(sc.nextLong());

        System.out.print("Enter the Email:");
        contact.setEmailId(sc.next());

        phoneBook.addContact(contact);
    }

    public static void displayAllContacts() {
        System.out.println("The contacts in the List are:");
        for (Contact contact : phoneBook.viewAllContacts()) {
            printContact(contact);
        }
    }

    public static void printContact(Contact contact) {
        System.out.println("First Name: " + contact.getFirstName());
        System.out.println("Last Name: " + contact.getLastName());
        System.out.println("Phone No: " + contact.getPhoneNumber());
        System.out.println("Email: " + contact.getEmailId());
    }

    public static void getContactByPhone() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Phone number to search contact:");
        printContact(phoneBook.viewContactGivenPhone(sc.nextLong()));

    }

}
