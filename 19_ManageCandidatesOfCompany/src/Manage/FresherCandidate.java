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
public class FresherCandidate extends Candidate {

    private String graduationDate;
    private String graduationRank;
    private String eduation;

    public FresherCandidate() {
    }

    public FresherCandidate(String graduationDate, String graduationRank, String eduation) {
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.eduation = eduation;
    }

    public FresherCandidate(String graduationDate, String graduationRank, String eduation, int candidateID, String firstName, String lastName, String birthDate, String address, String Email, String Phone, int datatype) {
        super(candidateID, firstName, lastName, birthDate, address, Email, Phone, datatype);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.eduation = eduation;
    }

    public String getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(String graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    public String getEduation() {
        return eduation;
    }

    public void setEduation(String eduation) {
        this.eduation = eduation;
    }

    @Override
    public String toString() {
        return super.toString()+ "graduationDate=" + graduationDate + " | graduationRank= "  + graduationRank + " |  eduation: " + eduation ;
    }
    
    

    public void input(int inputId, int dataType) {
        super.input(inputId, dataType);
        System.out.print("Gradution Date : ");
        graduationDate = Validation.checkDateFormat();
        System.out.print("Graduation Rank : ");
        graduationRank = Validation.checkInputGraduationRank();
        System.out.print("Eduation : ");
        eduation = Validation.checkInputString();
    }
}
