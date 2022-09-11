/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ContactManagerProgram;

/**
 *
 * @author admin
 */
public class Menu {
    public static int menu() {
        System.out.println("=================Contact Program ==========");
        System.out.println("1. Add a contact\n"
                + "2. Display all contacts\n"
                + "3. Delete a contact\n"
                + "4. Exit");
        System.out.print("Enter your choice : ");
        int choice = Validation.sc.nextInt();
        Validation.sc.nextLine();
        return choice;
    }
}
