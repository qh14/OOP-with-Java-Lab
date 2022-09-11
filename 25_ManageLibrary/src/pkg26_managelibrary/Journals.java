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
public class Journals extends Document{
    private String issueMonth;

    public Journals() {
    }

    public Journals(String issueMonth) {
        this.issueMonth = issueMonth;
    }

    public Journals(String issueMonth, String documentID, String publisherName, String issueNumber) {
        super(documentID, publisherName, issueNumber);
        this.issueMonth = issueMonth;
    }

    public String getIssueMonth() {
        return issueMonth;
    }

    public void setIssueMonth(String issueMonth) {
        this.issueMonth = issueMonth;
    }

    

    @Override
    public void input(ArrayList<Document> list,String s) {
        super.input(list,s); //To change body of generated methods, choose Tools | Templates.
        System.out.print("Enter"+s+" issue month : ");
        issueMonth = Validation.checkMonthFormat();
    }

    @Override
    public String toString() {
        return super.toString()+ "| " + issueMonth ;
    }
    
}
