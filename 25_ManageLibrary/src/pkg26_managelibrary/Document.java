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
public class Document implements Comparable<Document>{
    //Document ID (is unique), Publisher Name, Issue Number.
    protected String documentID;
    protected String publisherName;
    protected String issueNumber;

    public Document() {
    }

    public Document(String documentID, String publisherName, String issueNumber) {
        this.documentID = documentID;
        this.publisherName = publisherName;
        this.issueNumber = issueNumber;
    }

    public String getDocumentID() {
        return documentID;
    }

    public void setDocumentID(String documentID) {
        this.documentID = documentID;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public String getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(String issueNumber) {
        this.issueNumber = issueNumber;
    }
    public void input(ArrayList<Document> list,String s){
        System.out.print("Enter"+s+" Document ID: ");
        documentID = Validation.inputID(list);
        System.out.print("Enter"+s+" Publisher Name : ");
        publisherName = Validation.checkInputString();
        System.out.print("Enter"+ s + " Issue Number:");
        issueNumber =  Validation.checkInputString();        
    }

    @Override
    public String toString() {
        return  documentID + "| " + publisherName + "| " + issueNumber ;
    }

    @Override
    public int compareTo(Document o) {
        return this.getPublisherName().compareTo(o.getPublisherName());
    }
    
}
