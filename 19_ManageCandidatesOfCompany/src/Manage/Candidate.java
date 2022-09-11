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
public class Candidate {

    protected int candidateID;
    protected String firstName;
    protected String lastName;
    protected String birthDate;
    protected String address;
    protected String email;
    protected String phone;
    protected int datatype;

    public Candidate() {
    }

    public Candidate(int candidateID, String firstName, String lastName, String birthDate, String address, String Email, String Phone, int datatype) {
        this.candidateID = candidateID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.address = address;
        this.email = Email;
        this.phone = Phone;
        this.datatype = datatype;
    }

    public int getCandidateID() {
        return candidateID;
    }

    public void setCandidateID(int candidateID) {
        this.candidateID = candidateID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String Email) {
        this.email = Email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String Phone) {
        this.phone = Phone;
    }

    public int getDatatype() {
        return datatype;
    }

    public void setDatatype(int datatype) {
        this.datatype = datatype;
    }

    @Override
    public String toString() {
        return  "ID: " + candidateID + " | " + firstName+ lastName + " | Birthdate: " + birthDate + " | Address: " + address + " | Email: " + email + " | Phone: " + phone + " | datatype: " + datatype ;
    }
    public void input(int inputId,int dataType){
        candidateID = inputId;
        System.out.print("Enter First Name : ");
        firstName = Validation.checkInputString();
        System.out.print("Enter Last Name : ");
        lastName = Validation.checkInputString();
        System.out.print("BirthDate : ");
        birthDate = Validation.checkSimpleDateFormat();
        System.out.print("Address : ");
        address = Validation.checkInputString();
        System.out.print("Email : ");
        email = Validation.checkInputEmail();
        System.out.print("Phone : ");
        phone = Validation.checkInputPhone();
        datatype = dataType;
    }
    
    
}
