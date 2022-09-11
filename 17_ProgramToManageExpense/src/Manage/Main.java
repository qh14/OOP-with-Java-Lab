/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manage;

/**
 *
 * @author admin
 */
public class Main {

    public static void main(String[] args) {
        ManageExpense manageExpense = new ManageExpense();
        while (true) {
            Menu.menu();
            System.out.print("Your choice:");
            int choice = Validation.checkInputIntLimit(1, 4);
            switch (choice) {
                case 1:
                    manageExpense.addExpenses();
                    break;
                case 2:
                    manageExpense.displayAll();
                    break;
                case 3:
                    manageExpense.deleteExpenses();
                    break;
                case 4:
                    return;

            }
        }
    }
}
