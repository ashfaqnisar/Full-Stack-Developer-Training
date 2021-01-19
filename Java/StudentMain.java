import java.util.Arrays;
import java.util.Scanner;

class Student { //This should be public
    private int studentId;
    private String studentName, studentAddress, collegeName;

    public Student() {
    }

    public Student(int studentId) {
        this.studentId = studentId;
    }

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public Student(int studentId, String studentName, String studentAddress) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.collegeName = "NIT";
    }

    public Student(int studentId, String studentName, String studentAddress, String collegeName) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.collegeName = collegeName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    @Override
    public String toString() {

        System.out.println("Student id:" + studentId);
        System.out.println("Student name:" + studentName);
        System.out.println("Address:" + studentAddress);
        System.out.println("College name:" + collegeName);

        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                ", collegeName='" + collegeName + '\'' +
                '}';
    }
}

public class StudentMain {
    public static void main(String[] args) {
        int studentId;
        String studentName, studentAddress, collegeName;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student's Id:");
        studentId = sc.nextInt();

        System.out.println("Enter Student's Name:");
        studentName = sc.nextLine();

        System.out.println("Enter Student's Address:");
        studentAddress = sc.nextLine();

        System.out.println("Whether the student is from NIT(Yes/No):");
        String fromNit = sc.nextLine();

        while (!Arrays.asList("yes", "Yes", "no", "NO").contains(fromNit)) {
            System.out.println("Wrong Input");
            System.out.println("Whether the student is from NIT(Yes/No):");
            fromNit = sc.nextLine();
        }

        if (Arrays.asList("yes", "Yes").contains(fromNit)) {
            Student student = new Student(studentId, studentName, studentAddress);
            student.toString();
            return;
        }

        System.out.println("Enter the college name:");
        collegeName = sc.nextLine();

        Student student = new Student(studentId, studentName, studentAddress, collegeName);
        student.toString();
    }
}
