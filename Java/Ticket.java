public class Ticket {
    private int ticketid, price;
    private static int availableTickets;

    public int calculateTicketCost(int noOfTickets) {
        if (Ticket.availableTickets >= noOfTickets) {
            Ticket.availableTickets -= noOfTickets;
            return noOfTickets * price;
        }
        return -1;
    }

    public Ticket(int ticketid, int price) {
        this.ticketid = ticketid;
        this.price = price;
    }

    public Ticket(int ticketid) {
        this.ticketid = ticketid;
    }

    public Ticket() {
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

    public static int getAvailableTickets() {
        return availableTickets;
    }

    public static void setAvailableTickets(int availableTickets) {
        if (availableTickets > 0) {
            Ticket.availableTickets = availableTickets;
        }
    }
}
