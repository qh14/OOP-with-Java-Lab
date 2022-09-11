/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagePersonInfo;

/**
 *
 * @author admin
 */
public class Menu {

    public static int menu() {
        System.out.println("=====Management Person programer=====");
        System.out.println("1. Input person information\n"
                + "2. Show 3 persons information by ascending of salary\n"
                + "3. Exit\n");
        System.out.print("Enter your choice : ");
        int choice = Validation.checkinputlimit(1, 3);
        return choice;
    }
}
