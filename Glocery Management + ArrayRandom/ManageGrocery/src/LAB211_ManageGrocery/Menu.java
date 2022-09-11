/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB211_ManageGrocery;

/**
 *
 * @author admin
 */
public class Menu {

    public static int menu() {
        System.out.println("======== Items Management =========\n"
                + "    1. Create Item\n"
                + "    2. View item information\n"
                + "    3. Update\n"
                + "    4. Delete\n"
                + "    5. Exit\n");
        System.out.print("Enter your choice : ");
        int choice = Validation.checkInputIntLimit(1, 5);
        return choice;
    }
}
