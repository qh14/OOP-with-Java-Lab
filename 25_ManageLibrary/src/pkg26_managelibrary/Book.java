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
public class Book extends Document{
    //author name, page number
    private String authorName;
    private int pageNumber;

    public Book() {
    }

    public Book(String authorName, int pageNumber) {
        this.authorName = authorName;
        this.pageNumber = pageNumber;
    }

    public Book(String authorName, int pageNumber, String documentID, String publisherName, String issueNumber) {
        super(documentID, publisherName, issueNumber);
        this.authorName = authorName;
        this.pageNumber = pageNumber;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    @Override
    public String toString() {
        return super.toString()+"| " + authorName + "| " + pageNumber ;
    }

    @Override
    public void input(ArrayList<Document> list,String s) {
        super.input(list,s); 
        System.out.print("Enter"+s+" Author Name: ");
        authorName = Validation.checkInputString();
        System.out.print("Enter"+s+" Page Number: ");
        pageNumber = Validation.checkInputInt();
    }
    
}
