/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TaskManagementExercise;

/**
 *
 * @author admin
 */
public class Menu {

    public static int menu() {
        System.out.println("========= Task program =========");
        System.out.println("1. Add Task\n"
                + "2. Delete task\n"
                + "3. Display Task\n"
                + "4. exit");
        System.out.print("Enter your choice : ");
        int choice = Validation.checkInputIntLimit(1, 4);
        return choice;
    }
}
