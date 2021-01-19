import java.util.Scanner;

class HostelStudent {
    protected int studentId, departmentId;
    protected String name, gender, phone;

    public HostelStudent() {
    }

    public HostelStudent(int studentId, String name, int departmentId, String gender, String phone) {
        this.studentId = studentId;
        this.departmentId = departmentId;
        this.name = name;
        this.gender = gender;
        this.phone = phone;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

class Hosteller extends HostelStudent {
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

public class HostelMain {

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
