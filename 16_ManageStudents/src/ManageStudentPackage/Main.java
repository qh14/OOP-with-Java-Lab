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
public class Main {
    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement();
        studentManagement.data();
        while (true) {
            int choice = Menu.menu();
            switch (choice) {
                case 1:
                    studentManagement.createStudent();
                    break;
                
                case 2:
                    studentManagement.findAndSort();
                    break;
                case 3:
                    studentManagement.updateOrDelete();
                    break;
                case 4 :
                    studentManagement.report();
                    break;
                case 5:
                    return;
            }
        }
    }
}
