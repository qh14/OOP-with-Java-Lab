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
        EmployeeManage newEmployeeManage = new EmployeeManage();
        while (true) {
            System.out.println("================== MENU =================");
            System.out.println("1 - Add Employee");
            System.out.println("2 - Display All");
            System.out.println("3 - Quit");
            System.out.print("Enter your choice : ");
            int choice = Validation.checkInputIntLimit(1, 3);
            switch (choice) {
                case 1:
                    newEmployeeManage.add();
                    break;
                case 2:
                    newEmployeeManage.display();
                    break;
                case 3:
                    return;
            }
        }
    }
}
