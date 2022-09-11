/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManageStudentPackage;

/**
 *
 * @author admin
 */
public class Menu {
     public static int menu() {
        System.out.println("WELCOME TO STUDENT MANAGEMENT");
        System.out.println("\t1. Create\n"
                + "\t2. Find and Sort\n"
                + "\t3. Update/Delete\n"
                + "\t4. Report\n"
                + "\t5. Exit");
        System.out.print("Enter your choice : ");
        int choice = Validation.checkInputIntLimit(1, 5);
        return choice;
    }
}
