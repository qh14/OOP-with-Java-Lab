/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg9_lab211manageworkerinformation;

/**
 *
 * @author admin
 */
public class Menu {
    public static int menu() {
        System.out.println("======== Worker Management =========");
        System.out.println("1. Add a Worker.\n"
                + "2. Increase salary for worker.\n"
                + "3. Decrease salary for worker.\n"
                + "4. Show adjusted salary worker information.\n" + "5. Quit\n");
        System.out.print("Enter your choice : ");
        int choice = Validation.checkInputIntLimit(1, 5);
        return choice;
    }
}
