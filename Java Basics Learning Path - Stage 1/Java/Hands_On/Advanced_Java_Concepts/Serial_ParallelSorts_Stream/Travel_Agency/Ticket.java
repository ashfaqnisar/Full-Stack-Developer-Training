package Hands_On.Advanced_Java_Concepts.Serial_ParallelSorts_Stream.Travel_Agency;
/*Remove the package import from the code in genc learn*/

public class Ticket {
    private long pnrNo;
    private String passengerName;
    private int seatNo;
    private String classType;
    private double ticketFare;

    public Ticket() {

    }

    // Write the 5 argument constructor
    public Ticket(long pnrNo, String passengerName, int seatNo, String classType, double ticketFare) {

        this.pnrNo = pnrNo;
        this.passengerName = passengerName;
        this.seatNo = seatNo;
        this.classType = classType;
        this.ticketFare = ticketFare;
    }

    public long getPnrNo() {
        return pnrNo;
    }

    public void setPnrNo(long pnrNo) {
        this.pnrNo = pnrNo;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public int getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(int seatNo) {
        this.seatNo = seatNo;
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    public double getTicketFare() {
        return ticketFare;
    }

    public void setTicketFare(double ticketFare) {
        this.ticketFare = ticketFare;
    }


}
