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
public class Main {

    public static void main(String[] args) {
        TaskManage manage = new TaskManage();
        while (true) {
            int choice = Menu.menu();
            switch (choice) {
                case 1:
                    manage.addTask();
                    break;
                case 2:
                    manage.deleteTask();
                    break;
                case 3:
                    manage.displayTask();
                    break;
                case 4:

                    return;
                

            }
        }
    }
}
