/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manage;

/**
 *
 * @author admin
 */
public class InternCandidate extends Candidate{
    private String majors;
    private String semester;
    private String universityName;

    public InternCandidate() {
    }

    public InternCandidate(String majors, String semester, String universityName) {
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
    }

    public InternCandidate(String majors, String semester, String universityName, int candidateID, String firstName, String lastName, String birthDate, String address, String Email, String Phone, int datatype) {
        super(candidateID, firstName, lastName, birthDate, address, Email, Phone, datatype);
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public String toString() {
        return super.toString() + "majors=" + majors + ", semester=" + semester + ", universityName=" + universityName ;
    }
    @Override
    public void input(int inputId, int dataType) {
        super.input(inputId, dataType);
        System.out.print("Major : ");
        majors = Validation.checkInputString();
        System.out.print("Semester : ");
        semester = Validation.checkInputString();
        System.out.print("University Name : ");
        universityName = Validation.checkInputString();
    }
}
