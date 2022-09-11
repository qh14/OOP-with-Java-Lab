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
public class Main {
    public static void main(String[] args) {
        PersonInfoManage manage = new PersonInfoManage();
        while (true) {
            int choice = Menu.menu();
            switch (choice) {
                case 1:
                    manage.inputPersonInfo();
                    break;
                case 2 :
                    manage.showInfo();
                    break;
                case 3:
                    return;
            }
        }
    }
}
