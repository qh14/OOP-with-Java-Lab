/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManageStudentPackage;

/**
 *
 * @author admin
 */
public class Student implements Comparable<Student>{
    private String ID;
    private String studentName; 
    private String Semester;
    private String courseName;

    public Student() {
    }

    public Student(String ID, String studentName, String Semester, String courseName) {
        this.ID = ID;
        this.studentName = studentName;
        this.Semester = Semester;
        this.courseName = courseName;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getSemester() {
        return Semester;
    }

    public void setSemester(String Semester) {
        this.Semester = Semester;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "Student{" + "ID=" + ID + ", studentName=" + studentName + ", Semester=" + Semester + ", courseName=" + courseName + '}';
    }

    @Override
    public int compareTo(Student o) {
        return o.getStudentName().compareTo(this.getStudentName());
    }
    
}
