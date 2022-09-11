/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ContactManagerProgram;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class ContactManage {

    ArrayList<Contact> listContact = new ArrayList<>();
    public static int contactID = 1;

    public Contact enterContact() {

        System.out.print("Enter First Name : ");
        String firstName = Validation.sc.nextLine();
        System.out.print("Enter Last Name :");
        String lastName = Validation.checkInputString();
        System.out.print("Enter group  : ");
        String group = Validation.checkInputString();
        System.out.print("Enter address : ");
        String address = Validation.checkInputString();
        System.out.print("Enter phone : ");
        String phone = Validation.isValidPhoneNumber();
        Contact newContact = new Contact(contactID, firstName +" " +lastName, group, address, phone, lastName, firstName);

        contactID++;
        System.out.println("Successful");
        return newContact;
    }

    public void addContact() {
        boolean choose = true;

        listContact.add(enterContact());

    }

    public void displayContact() {
        System.out.printf("%5s%25s%20s%20s%20s%20s%20s\n", "ID", "name", "firstName", "lastName", "group", "address", "phone");
        for (int i = 0; i < listContact.size(); i++) {
            listContact.get(i).display();

        }
    }

    public int findIndexName(int code) {
        for (int i = 0; i < listContact.size(); i++) {
            if (listContact.get(i).getID() == code) {
                return i;
            }
        }
        return -1;
    }

    public void deleteContact() {
        System.out.print("Enter code to delete : ");
        int code = Validation.checkInputInt();
        if (findIndexName(code) == -1) {
            System.out.println("Cann't find name.");
            return;
        }
        listContact.remove(findIndexName(code));
        System.out.println("Completed!");
    }
}
