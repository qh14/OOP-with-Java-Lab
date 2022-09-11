/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg26_managelibrary;

/**
 *
 * @author admin
 */
public class Menu {

    public static int menu() {
        System.out.println("=================== Library Management===================");
        System.out.println("   1. Add new documents: Books, magazines, newspapers.\n"
                + "   2. Delete documents by document code.\n"
                + "   3. View information about the documents ascending by name.\n"
                + "   4. Update a documents information by document code\n"
                + "   5. Exit the program.");
        System.out.print("Enter your choice : ");
        int choice = Validation.checkInputIntLimit(1, 5);
        return choice;
    }
}
