package Hands_On.Applying_Object_Oriented_Concepts.Classes_And_Objects.Ticket_Price_Calculation;
/*Remove the package import from the code in genc learn*/

public class Ticket {
    private static int availableTickets;
    private int ticketid, price;

    public Ticket(int ticketid, int price) {
        this.ticketid = ticketid;
        this.price = price;
    }

    public Ticket(int ticketid) {
        this.ticketid = ticketid;
    }

    public Ticket() {
    }

    public static int getAvailableTickets() {
        return availableTickets;
    }

    public static void setAvailableTickets(int availableTickets) {
        if (availableTickets > 0) {
            Ticket.availableTickets = availableTickets;
        }
    }

    public int calculateTicketCost(int noOfTickets) {
        if (Ticket.availableTickets >= noOfTickets) {
            Ticket.availableTickets -= noOfTickets;
            return noOfTickets * price;
        }
        return -1;
    }

    public int getTicketid() {
        return ticketid;
    }

    public void setTicketid(int ticketid) {
        this.ticketid = ticketid;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
