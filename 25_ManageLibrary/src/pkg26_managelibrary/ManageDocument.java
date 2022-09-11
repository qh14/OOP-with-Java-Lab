/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg26_managelibrary;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author admin
 */
public class ManageDocument {
     ArrayList<Document> listdocument = new ArrayList<>();

    public void addDocument() {
        System.out.println("--------- Add document --------");
        System.out.println("Please enter 1 to create Books, 2 to create Magazines, 3 to create Newspapers");
        int choice = Validation.checkInputIntLimit(1, 3);
        switch (choice) {
            case 1:
                Book newBook = new Book();
                newBook.input(listdocument,"");
                listdocument.add(newBook);
                break;
            case 2:
                Journals journals = new Journals();
                journals.input(listdocument,"");
                listdocument.add(journals);
                break;
            case 3:
                Newspapers newspapers = new Newspapers();
                newspapers.input(listdocument,"");
                listdocument.add(newspapers);
                break;
        }
    }

    public void deleteDocument() {
        System.out.println("------- Delete document--------");
        System.out.print("Enter code : ");
        String id = Validation.checkInputString();
        if (findIndexID(listdocument, id) == -1) {
            System.out.println("Not Found");
            return;
        }
        listdocument.remove(findIndexID(listdocument, id));
        System.out.println("Delete Successful.");
    }

    public int findIndexID(ArrayList<Document> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getDocumentID().equals(id)) {
                return i;
            }

        }
        return -1;
    }

    public void updateDocument() {
        System.out.println("--------- Update document----");
        System.out.print("Enter Code: ");
        String code = Validation.checkInputString();
        int indexFindCode = findIndexID(listdocument, code);
        if (indexFindCode == -1) {
            System.out.println("Not Found");
            return;
        }
       
        
        int index = 1;
        if (listdocument.get(indexFindCode) instanceof Book) {
            index = 1;
        }
        if (listdocument.get(indexFindCode) instanceof Journals) {
            index = 2;
        }
        if (listdocument.get(indexFindCode) instanceof Newspapers) {
            index = 3;
        }
        Document document = null;
        switch (index) {
            case 1:
                document = new Book();
                document.input(listdocument," new");
                break;
            case 2:
                document = new Journals();
                document.input(listdocument," new");
                break;
            case 3:
                document = new Newspapers();
                document.input(listdocument," new");
                break;
        }
        if (listdocument == null) {
            listdocument.add(document);
        }else{
            listdocument.set(indexFindCode, document);
        }
        
    }
    public void printAll(){
        if (listdocument.isEmpty()) {
            System.out.println("List Empty.");
        }
        Collections.sort(listdocument);
        System.out.println("--------------------Display Document Information-------------------");
        for (int i = 0; i < listdocument.size(); i++) {
            System.out.println(listdocument.get(i).toString());
            
        }
    }

}
