package Hands_On.Applying_Object_Oriented_Concepts.Inheritance.Contact_Details_Of_Hosteller;
/*Remove the package import from the code in genc learn*/

public class Student {
    protected int studentId, departmentId;
    protected String name, gender, phone;

    public Student() {
    }

    public Student(int studentId, String name, int departmentId, String gender, String phone) {
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
