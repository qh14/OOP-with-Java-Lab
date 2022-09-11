/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg26_managelibrary;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Newspapers extends Document{
    private String issueDate;

    public Newspapers() {
    }

    public Newspapers(String issueDate) {
        this.issueDate = issueDate;
    }

    public Newspapers(String issueDate, String documentID, String publisherName, String issueNumber) {
        super(documentID, publisherName, issueNumber);
        this.issueDate = issueDate;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    @Override
    public void input(ArrayList<Document> list,String s) {
        super.input(list,s); //To change body of generated methods, choose Tools | Templates.
        System.out.print("Enter"+s+" issue date : ");
        issueDate = Validation.checkDateFormat();
    }
    
    @Override
    public String toString() {
        return super.toString()+ "| " + issueDate ;
    }
}
