package Hands_On.Advanced_Java_Concepts.Serial_ParallelSorts_Stream.Travel_Agency;
/*Remove the package import from the code in genc learn*/

import java.io.IOException;
import java.util.Scanner;

public class UserInterface {

    public static CommissionInfo generateCommissionObtained() {
        return (x) -> {
            if (x.getClassType().equalsIgnoreCase("SL") || x.getClassType().equalsIgnoreCase("2S")) {
                return 60;
            } else if (x.getClassType().equalsIgnoreCase("1A") || x.getClassType().equalsIgnoreCase("2A") || x.getClassType().equalsIgnoreCase("3A")) {
                return 100;
            }
            return 0;
        };
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no of passengers");
        int n = sc.nextInt();

        Ticket[] ticketArray = new Ticket[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Details of Passenger " + (i + 1) + ":");

            System.out.println("Enter the pnr no:");
            long pnr = sc.nextLong();

            /*A fake sc nextline*/
            sc.nextLine();
            System.out.println("Enter passenger name:");
            String name = sc.nextLine();

            System.out.println("Enter seat no:");
            int seat = sc.nextInt();

            sc.nextLine();
            System.out.println("Enter class type:");
            String classType = sc.nextLine();

            System.out.println("Enter ticket fare:");
            double fare = sc.nextDouble();

            Ticket ticket = new Ticket(pnr, name, seat, classType, fare);
            ticketArray[i] = ticket;
        }

        double commission = 0;
        for (Ticket ticket : ticketArray) {
            CommissionInfo commissionInfo = generateCommissionObtained();
            commission += commissionInfo.calculateCommissionAmount(ticket);
        }

        System.out.println("Commission Obtained");
        System.out.printf("Commission obtained per each person: Rs.%.2f", commission);

    }

}
