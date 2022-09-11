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
public class ExperienceCandidate extends Candidate{
     private int expInYear;
    private String proSkill;

    public ExperienceCandidate() {
    }

    public ExperienceCandidate(int expInYear, String proSkill) {
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public ExperienceCandidate(int expInYear, String proSkill, int candidateID, String firstName, String lastName, String birthDate, String address, String Email, String Phone, int datatype) {
        super(candidateID, firstName, lastName, birthDate, address, Email, Phone, datatype);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public int getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(int expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    @Override
    public String toString() {
        return super.toString() + " | Exp In Year : " + expInYear + " | proSkill : " + proSkill ;
    }
    
     @Override
    public void input(int inputId, int dataType) {
        super.input(inputId, dataType);
        System.out.print("Enter Exp In Year : ");
        expInYear = Validation.checkInputIntLimit(0, 100);
        System.out.print("Enter Pro Skill : ");
        proSkill = Validation.checkInputString();
    }
}
