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
public class Main {
    public static void main(String[] args) {
        ContactManage manage = new ContactManage();
        int choice = 0;
       
        while (choice != 4) {
            choice = Menu.menu();            
            switch (choice) {
                case 1:
                    manage.addContact();
                    break;
                case 2 :
                    manage.displayContact();
                    break;
                case 3 :
                    manage.deleteContact();
                    break;
                case 4 :
                    return;
                default:
                    System.out.println("Enter number [1..4]");
            }
        }
    }
}
