package com.programs.Ticket;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bookings = 0, availableTickets = 0;

        System.out.println("Enter no of bookings:");
        bookings = sc.nextInt();


        System.out.println("Enter the available tickets:");
        availableTickets = sc.nextInt();
        Ticket.setAvailableTickets(availableTickets);

        for (int i = 0; i < bookings; i++) {
            int ticketId, price, noOfTickets;
            System.out.println("Enter the ticketid:");
            ticketId = sc.nextInt();

            System.out.println("Enter the price:");
            price = sc.nextInt();

            System.out.println("Enter the no of tickets:");
            noOfTickets = sc.nextInt();

            Ticket ticket = new Ticket(ticketId, price);

            System.out.println("Available tickets: " + Ticket.getAvailableTickets());
            System.out.println("Total amount: " + ticket.calculateTicketCost(noOfTickets));

            System.out.println("Available tickets after booking: " + Ticket.getAvailableTickets());
        }
    }
}
