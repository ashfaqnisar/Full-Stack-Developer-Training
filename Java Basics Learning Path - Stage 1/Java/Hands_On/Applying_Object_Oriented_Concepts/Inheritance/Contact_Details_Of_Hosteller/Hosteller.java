package Hands_On.Applying_Object_Oriented_Concepts.Inheritance.Contact_Details_Of_Hosteller;
/*Remove the package import from the code in genc learn*/

public class Hosteller extends Student {
    private String hostelName;
    private int roomNumber;

    public Hosteller() {
    }

    public Hosteller(String hostelName, int roomNumber) {
        this.hostelName = hostelName;
        this.roomNumber = roomNumber;
    }

    public String getHostelName() {
        return hostelName;
    }

    public void setHostelName(String hostelName) {
        this.hostelName = hostelName;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public String toString() {
        return "The Student Details\n" +
                studentId + " " +
                name + " " +
                departmentId + " " +
                gender + " " +
                phone + " " +
                hostelName + " " + roomNumber;
    }
}
